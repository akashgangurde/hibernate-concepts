package com.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="atCOURSE")
public class Course {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="atCOURSE_ID")
	private long courseId;
	
	
	@Column(name="COURSE_NAME")
	private String courseName;

	
	
	
	
	
	public Course() {
		super();
		
	}

	public Course(String courseName) {
		super();
		this.courseName = courseName;
	}

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

}
