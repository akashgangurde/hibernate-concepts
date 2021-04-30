package com.ag;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserDao {

	public static int register(User u) {
		
		int i = 0;
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		i = (Integer)session.save(u);
		
		transaction.commit();
		session.close();
		
		return i;
		
	}

}
