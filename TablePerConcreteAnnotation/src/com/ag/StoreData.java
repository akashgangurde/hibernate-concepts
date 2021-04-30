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
		
		Employee e1 = new Employee();
		e1.setName("Lebron");
		
		Regular_Employee e2 = new Regular_Employee();
		e2.setName("Marc Gasol");
		e2.setSalary(250000);
		e2.setBonus(5);
		
		Contract_Employee e3 = new Contract_Employee();
		e3.setName("Kyle Kuzma");
		e3.setPay_per_hour(500);
		e3.setContract_duration("2 years");
		
		session.persist(e1);
		session.persist(e2);
		session.persist(e3);
		
		transaction.commit();
		session.close();
		System.out.println("Success");
	}

}
