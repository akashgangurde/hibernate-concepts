package com;
// Generated Feb 26, 2021, 12:48:43 PM by Hibernate Tools 4.0.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Depart generated by hbm2java
 */
public class Depart implements java.io.Serializable {

	private Integer did;
	private String dname;
	private Set emps = new HashSet(0);

	public Depart() {
	}

	public Depart(String dname, Set emps) {
		this.dname = dname;
		this.emps = emps;
	}

	public Integer getDid() {
		return this.did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Set getEmps() {
		return this.emps;
	}

	public void setEmps(Set emps) {
		this.emps = emps;
	}

}