package com.ag;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Java is a programming language");
		set1.add("Java is a platform");
		
		HashSet<String> set2 = new HashSet<String>();
		set2.add("Servlet is an Interface");
		set2.add("Servlet is an API");
		
		Question question1 = new Question();
		question1.setQname("What is Java?");
		question1.setAnswers(set1);
		
		Question question2 = new Question();
		question2.setQname("What is Servlet?");
		question2.setAnswers(set2);
		
		session.persist(question1);
		session.persist(question2);
		
		transaction.commit();
		session.close();
		System.out.println("Success");
		
		
		
	}

}
