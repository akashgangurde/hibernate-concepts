package com.pojo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "atStudent")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "atSTUDENT_ID")
	private long studentId;

	@Column(name = "atSTUDENT_NAME")
	private String studentName;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "atSTUDENT_COURSE",
	joinColumns = { @JoinColumn(name = "atSTUDENT_ID") }, 
	inverseJoinColumns  = { @JoinColumn(name = "atCOURSE_ID") })
	private Set<Course> courses;

	public Student() {
		super();

	}

	public Student(String studentName, Set<Course> courses) {
		super();
		this.studentName = studentName;
		this.courses = courses;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

}
