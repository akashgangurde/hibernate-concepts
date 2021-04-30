package com.model;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.Depart;
import com.Emp;

public class BLManager {

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	public List<Emp> SearchEmplist() {
		Session s1 = factory.openSession();
		Criteria cr = s1.createCriteria(Emp.class);
		List<Emp> s = cr.list();
		return s;
	}
	
	@SuppressWarnings("unchecked")
	public List<Depart> SearchDepartlist() {
		Session s1 = factory.openSession();
		Criteria cr = s1.createCriteria(Depart.class);
		List<Depart> s = cr.list();
		return s;
	}
	
	@SuppressWarnings("unchecked")
	public List<Emp> getAllEmp() {
		Session s1 = factory.openSession();
		Criteria cr = s1.createCriteria(Emp.class);
		List<Emp> s = cr.list();
		return s;
	}
	
	@SuppressWarnings("unchecked")
	public List<Depart> getAllDepart() {
		Session s1 = factory.openSession();
		Criteria cr = s1.createCriteria(Depart.class);
		List<Depart> s = cr.list();
		return s;
	}
	
	public Emp SearchById(int id1) {
		Session s1 = factory.openSession();
		Criteria cr = s1.createCriteria(Emp.class);
		cr.add(Restrictions.eq("eid", id1));
		Emp e = (Emp) cr.uniqueResult();
		return e;
	}
	
	public Depart SearchById1(int id) {
		Session s1 = factory.openSession();
		Criteria cr = s1.createCriteria(Depart.class);
		cr.add(Restrictions.eq("did", id));
		Depart d = (Depart) cr.uniqueResult();
		return d;
	}
	
	public void DeleteEmp(Emp e) {
		Session s1 = factory.openSession();
		Transaction t = s1.beginTransaction();
		s1.delete(e);
		t.commit();
		s1.close();
	}
	
	public void DeleteDepart(Depart d1) {
		Session s1 = factory.openSession();
		Transaction t = s1.beginTransaction();
		s1.delete(d1);
		t.commit();
		s1.close();
	}
	
	public void saveEmp(Emp e) {
		Session s1 = factory.openSession();
		Transaction t = s1.beginTransaction();
		s1.save(e);
		t.commit();
		s1.close();
	}
	
	public void saveDepart(Depart d) {
		Session s1 = factory.openSession();
		Transaction t = s1.beginTransaction();
		s1.save(d);
		t.commit();
		s1.close();
	}
	
	public Depart searchbyDname(String dname) {
		Session s = factory.openSession();
		Criteria cr = s.createCriteria(Depart.class);
		cr.add(Restrictions.eq("dname", dname));
		Depart d = (Depart)cr.uniqueResult();
		return d;
	}
	
	public void updateDepart(Depart d) {
		Session s1 = factory.openSession();
		Transaction t = s1.beginTransaction();
		s1.merge(d);
		t.commit();
		s1.close();
	}
	
	public void updateEmp(Emp e) {
		Session s1 = factory.openSession();
		Transaction t = s1.beginTransaction();
		s1.merge(e);
		t.commit();
		s1.close();
	}

}
