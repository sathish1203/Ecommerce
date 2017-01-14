package com.main.program;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.portal.daos.HibernateSession;
import com.portal.daos.UserDAO;
import com.portal.models.User;

import portal.daos.modelDaos.userAccess;



public class App {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_beans.xml");
		HibernateSession db_session = (HibernateSession) context.getBean("h2_db_01");
		userAccess userAcc = new userAccess(db_session.getSessionFactory());
		List<User> users = new ArrayList<User>();
		users= userAcc.getUsers();
		
		System.out.println("User is"+users);
		for (User user:users)
		{
			System.out.println("User is "+ user.getUname());
			System.out.println("Last name is "+ user.getLastname());
			
		}
		
		((AbstractApplicationContext) context).close();
	}
}