package com.portal.daos;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.portal.models.Client;


public class daoClass extends HibernateSession{

	public static class Model{
		static Class model;
	
		public static void setModel(Class modelName){
			Model.model = modelName;
			
		}	
	}
	
	
	SessionFactory mySessionFactory;
	
	public void setModel(Class model){
		Model.setModel(model);
	}
	
public daoClass(SessionFactory mySessionFactory, Class model){
	new Configuration().configure();
	this.mySessionFactory = mySessionFactory;
	setModel(model);
}

public List<Object> getData(){
	List<Object> data=null;
	try{
	Session session = mySessionFactory.openSession();
    session.beginTransaction();
    Criteria criteria = session.createCriteria(Model.model);
    data= (List<Object>)criteria.list();
    session.getTransaction().commit();
    session.close();
	}catch(Exception e){
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	return data;
}

public Client getUserByUsername(String uname){
	Client client=null;
	try{
	Session session = mySessionFactory.openSession();
    session.beginTransaction();
    Criteria criteria = session.createCriteria(Client.class).add(Restrictions.eq("uname", uname));
	client = (Client)criteria.uniqueResult();
    session.getTransaction().commit();
    session.close();
	}catch(Exception e){
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	return client;
}


public boolean addUser(Client u){
	boolean commit = false;
	try{
	Session session = mySessionFactory.openSession();
    session.beginTransaction();
    session.save(u);
    session.getTransaction().commit();
    session.close();
    commit = true;
	}catch(Exception e){
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	return commit;
}


public boolean UpdateUser(Client u){
	boolean commit = false;
	try{
	Session session = mySessionFactory.openSession();
    session.beginTransaction();
    session.update(u);
    session.getTransaction().commit();
    session.close();
    commit = true;
	}catch(Exception e){
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	return commit;
}


public boolean RemoveUser(Client u){
	boolean commit = false;
	try{
	Session session = mySessionFactory.openSession();
    session.beginTransaction();
    session.remove(u);
    session.getTransaction().commit();
    session.close();
	commit = true;
	}catch(Exception e){
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	return commit;
}


	
}
