package com.ag;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Java is a programming language");
		list1.add("Java is a platform");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Servlet is an Interface");
		list2.add("Servlet is an API");
		
		Question question1 = new Question();
		question1.setQname("What is Java?");
		question1.setAnswers(list1);
		
		Question question2 = new Question();
		question2.setQname("What is Servlet?");
		question2.setAnswers(list2);
		
		session.persist(question1);
		session.persist(question2);
		
		transaction.commit();
		session.close();
		System.out.println("Success");
		
		
		
	}

}
