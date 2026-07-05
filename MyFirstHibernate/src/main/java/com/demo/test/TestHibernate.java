package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Product;



public class TestHibernate {
	
	public static void main(String[] args) {
		

//	step 1 : build session factory from hibernate.cfg.xml
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	
//	open session
	Session session = factory.openSession();
	Transaction transaction = null;
	
	try {
		transaction = session.beginTransaction();
		
// create Product object
		
		Product product = new Product(1, "product1", 100);
		
		session.persist(product);
		
		transaction.commit();

		
		
	}catch(Exception e) {
		if(transaction != null) {
			transaction.rollback();
		}
		e.printStackTrace();
	}finally {
        session.close();
        factory.close();
    }
		
	}
	

	

}
