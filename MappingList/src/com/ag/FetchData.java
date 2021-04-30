package com.ag;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("from Question");
		List<Question> list = query.list();
		
		Iterator<Question> itr = list.iterator();
		
		while (itr.hasNext()) {
			Question question = itr.next();
			System.out.println("Question name: " + question.getQname());
			
			List<String> list2 = question.getAnswers();
			Iterator<String> itr2 = list2.iterator();
			while (itr2.hasNext()) {
				System.out.println(itr2.next());
				
			}
			
		}
		
		session.close();
		System.out.println("Success");

	}

}
