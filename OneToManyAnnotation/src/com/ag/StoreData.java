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
		
		Answer ans3 = new Answer();
		ans3.setAnswerName("Servlet is an Interface");
		ans3.setPostedBy("Kuz");
		
		Answer ans4 = new Answer();
		ans4.setAnswerName("Servlet is an API");
		ans4.setPostedBy("Marc");
		
		ArrayList<Answer> list1 = new ArrayList<Answer>();
		list1.add(ans1);
		list1.add(ans2);
		
		ArrayList<Answer> list2 = new ArrayList<Answer>();
		list2.add(ans3);
		list2.add(ans4);
		
		Question question1 = new Question();
		question1.setQname("What is Java");
		question1.setAnswers(list1);
		
		Question question2 = new Question();
		question2.setQname("What is Servlet");
		question2.setAnswers(list2);
		
		session.persist(question1);
		session.persist(question2);
		
		transaction.commit();
		session.close();
		System.out.println("Success");
		
	}

}
