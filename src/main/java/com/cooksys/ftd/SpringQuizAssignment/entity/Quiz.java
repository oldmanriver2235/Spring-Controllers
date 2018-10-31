package com.cooksys.ftd.SpringQuizAssignment.entity;

import java.util.HashMap;

public class Quiz {

	private String title;
	private HashMap<String, Question> questions = new HashMap<String, Question>();
	
	public Quiz() {
		super();
	}

	public Quiz(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public HashMap<String, Question> getQuestions() {
		return questions;
	}
	
	public void addQuestion(Question question) {
		this.questions.put(question.getQuestion(), question);
	}
	
	public Question removeQuestion(String question) {
		return this.questions.remove(question);
	}

	@Override
	public String toString() {
		return "Quiz [title=" + title + ", questions=" + questions + "]";
	}
	
}