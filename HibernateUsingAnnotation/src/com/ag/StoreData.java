package com.ag;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		
		SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee e2 = new Employee();
		e2.setId(3);
		e2.setFirstName("A");
		e2.setLastName("D");
		
		session.save(e2);
		transaction.commit();
		System.out.println("Successfully Stored");
		factory.close();
		session.close();
	}

}
