package com.ag;

import java.util.Map;

public class Question {
	
	private int id;
	private String questionName;
	private String username;
	private Map<String, String> answers;
	
	public Question() {
	
	}

	public Question(String questionName, String username, Map<String, String> answers) {
		super();
		this.questionName = questionName;
		this.username = username;
		this.answers = answers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestionName() {
		return questionName;
	}

	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Map<String, String> getAnswers() {
		return answers;
	}

	public void setAnswers(Map<String, String> answers) {
		this.answers = answers;
	}
	
	
	

}
