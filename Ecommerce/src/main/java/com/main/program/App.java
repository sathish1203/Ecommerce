package com.main.program;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.portal.daos.HibernateSession;
import com.portal.models.Client;
import portal.daos.modelDaos.userAccess;


public class App {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_beans.xml");
		HibernateSession db_session = (HibernateSession) context.getBean("h2_db_01");
		userAccess userAcc = new userAccess(db_session.getSessionFactory());
		List<Client> clients = new ArrayList<Client>();
		clients= userAcc.getUsers();
		
		System.out.println("User is"+clients);
		for (Client client:clients)
		{
			System.out.println("User is "+ client.getUname());
			System.out.println("Last name is "+ client.getLastname());
			
		}
		
		((AbstractApplicationContext) context).close();
	}
}