package com.ag;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class FetchData {

	public static void main(String[] args) {
		
		SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query query = session.createQuery("from Question");
		List<Question> list = query.list();
		
		Iterator<Question> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			Question question = iterator.next();
			System.out.println("Question Name: " + question.getQname());
			
			List<Answer> list2 = question.getAnswers();
			Iterator<Answer> iterator2 = list2.iterator();
			
			while (iterator2.hasNext()) {
				Answer answer = iterator2.next();
				System.out.println(answer.getAnswerName() + ": " + answer.getPostedBy());
				
			}
			
		}
		session.close();
		System.out.println("Success");
	}

}
