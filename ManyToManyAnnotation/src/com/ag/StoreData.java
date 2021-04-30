package com.ag;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class StoreData {

	public static void main(String[] args) {
		
		SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Answer ans1 = new Answer();
		ans1.setAnswerName("Java is a programming language");
		ans1.setPostedBy("Lebron");
		
		Answer ans2 = new Answer();
		ans2.setAnswerName("Java is a platform");
		ans2.setPostedBy("AD");
		
		Question q1 = new Question();
		q1.setQname("What is Java?");
		ArrayList<Answer> l1 = new ArrayList<Answer>();
		l1.add(ans1);
		l1.add(ans2);
		q1.setAnswers(l1);
		
		Answer ans3 = new Answer();
		ans3.setAnswerName("Servlet is an Interface");
		ans3.setPostedBy("Kuz");
		
		Answer ans4 = new Answer();
		ans4.setAnswerName("Servlet is an API");
		ans4.setPostedBy("Marc");
		
		Question q2 = new Question();
		q2.setQname("What is Servlet");
		ArrayList<Answer> l2 = new ArrayList<Answer>();
		l2.add(ans3);
		l2.add(ans4);
		q2.setAnswers(l2);
		
		session.persist(q1);
		session.persist(q2);
		
		
		transaction.commit();
		session.close();
		System.out.println("Success");
		
	}

}
