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
		
		Query query = session.createQuery("from Employee e");
		List<Employee> list = query.list();
		
		Iterator<Employee> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			Employee employee = iterator.next();
			System.out.println(employee.getEmployeeI() + " " + employee.getName() + " " + employee.getEmail());
			Address address = employee.getAddress();
			System.out.println(address.getAddressLine1() + " " + address.getCity() + " " + address.getState() + " " + address.getCountry() + " " +address.getPincode());
			
		}
		
		session.close();
		System.out.println("Success");
	}

}
