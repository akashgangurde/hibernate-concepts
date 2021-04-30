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
		e1.setName("Lebron James");
		e1.setEmail("lj2323@gmail.com");
		
		Address address1 = new Address();
		address1.setAddressLine1("A-23");
		address1.setCity("LA");
		address1.setState("Cal");
		address1.setCountry("USA");
		address1.setPincode(323);
		
		e1.setAddress(address1);
		address1.setEmployee(e1);
		
		session.persist(e1);
		session.persist(address1);
		
		transaction.commit();
		session.close();
		
		System.out.println("Success");
	}

}
