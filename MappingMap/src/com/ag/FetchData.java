package com.ag;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
		
		Iterator<Question> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			Question question = iterator.next();
			System.out.println("Question Id: " +question.getId());
			System.out.println("Question name: " +question.getQuestionName());
			System.out.println("Question posted by: " +question.getUsername());
			System.out.println("Answers: ");
			
			Map<String, String> map = question.getAnswers();
			Set<Map.Entry<String, String>> set = map.entrySet();
			
			Iterator<Map.Entry<String, String>> iteratoranswer = set.iterator();
			while (iteratoranswer.hasNext()) {
				Map.Entry<String, String> entry = (Map.Entry<String, String>) iteratoranswer.next();
				System.out.println("Answer name: " + entry.getKey());
				System.out.println("Answer posted by: " + entry.getValue());
			}
			
		}
		
		session.close();
	}

}
