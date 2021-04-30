package com.ag;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		Employee e=new Employee();
		e.setId(1);
		e.setFirstName("sayali");
		e.setLastName("rohade");
		
		s.save(e);
		t.commit();
		System.out.println("sucessful");
		sf.close();
		s.close();
		

	}

}
