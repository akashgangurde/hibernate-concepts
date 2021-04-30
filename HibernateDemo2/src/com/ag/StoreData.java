package com.ag;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class StoreData {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee e1 = new Employee();
		e1.setId(23);
		e1.setFirstName("Lebron");
		e1.setLastName("James");
		
		session.save(e1);
		transaction.commit();
		System.out.println("Successfully Stored");
		factory.close();
		session.close();
	}

}
