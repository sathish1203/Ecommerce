package com.portal.daos;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import com.portal.models.Cart;

public class CartDAOImpl{

SessionFactory cartSessionFactory;
	

public SessionFactory getCartSessionFactory() {
	return cartSessionFactory;
}

public void setCartSessionFactory(SessionFactory cartSessionFactory) {
	this.cartSessionFactory = cartSessionFactory;
}

@SuppressWarnings("unchecked")
public List<Cart> getCarts(){
	List<Cart> data=null;
	try{
	Session session = cartSessionFactory.openSession();
    session.beginTransaction();
    @SuppressWarnings("deprecation")
	Criteria criteria = session.createCriteria(Cart.class);
    data= (List<Cart>)criteria.list();
    session.getTransaction().commit();
    session.close();
	}catch(Exception e){
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	return data;
}

public Cart getCartById(String id){
	Cart client=null;
	try{
	Session session = cartSessionFactory.openSession();
    session.beginTransaction();
    @SuppressWarnings("deprecation")
	Criteria criteria = session.createCriteria(Cart.class).add(Restrictions.eq("id", id));
	client = (Cart)criteria.uniqueResult();
    session.getTransaction().commit();
    session.close();
	}catch(Exception e){
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	return client;
}


public boolean addCart(Cart u){
	boolean commit = false;
	try{
	Session session = cartSessionFactory.openSession();
    session.beginTransaction();
    session.saveOrUpdate(u);
    session.getTransaction().commit();
    session.close();
    commit = true;
	}catch(Exception e){
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	return commit;
}


public boolean UpdateCart(Cart u){
	boolean commit = false;
	try{
	Session session = cartSessionFactory.openSession();
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


public boolean RemoveCart(Cart u){
	boolean commit = false;
	try{
	Session session = cartSessionFactory.openSession();
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
