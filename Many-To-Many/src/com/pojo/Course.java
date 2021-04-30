package com.pojo;

public class Course {
	private long courseId;
	private String courseName;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
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
