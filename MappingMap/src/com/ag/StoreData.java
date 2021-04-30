package com.ag;

import java.util.HashMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		HashMap<String, String> map1 = new HashMap<String, String>();
		map1.put("Java is a programming language", "Lebron");
		map1.put("Java is a platform", "AD");
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("Servlet is an Interface", "Marc");
		map2.put("Servlet is a package", "Wes");
		
		Question question1 = new Question("What is Java", "AA", map1);
		Question question2 = new Question("What is Servlet", "FV", map2);
		
		session.persist(question1);
		session.persist(question2);
		
		transaction.commit();
		session.close();
		System.out.println("Success");

		
	}

}
