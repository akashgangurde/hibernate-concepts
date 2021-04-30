package com.ag;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee e1 = new Employee();
		e1.setName("Lebron");
		
		RegularEmployee e2 = new RegularEmployee();
		e2.setName("Marc Gasol");
		e2.setSalary(50000);
		e2.setBonus(5);
		
		ContractEmployee e3 = new ContractEmployee();
		e3.setName("Kyle Kuzma");
		e3.setPayPerHour(7500);
		e3.setContractDuration("15 hours");
		
		session.persist(e1);
		session.persist(e2);
		session.persist(e3);
		
		transaction.commit();
		session.close();
		System.out.println("Success");
		
		
	}

}
