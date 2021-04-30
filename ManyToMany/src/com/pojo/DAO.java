package com.pojo;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class DAO {

	public static void main(String[] args) {
		SessionFactory sf = new  AnnotationConfiguration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();

		Set<Course> c1 = new HashSet<Course>();
		c1.add(new Course("Maths"));
		c1.add(new Course("Computer Science"));

		Student s1 = new Student("Ganesh", c1);
		Student s2 = new Student("Amey", c1);

		s.save(s1);
		s.save(s2);

		t.commit();
		s.close();
	}
}
