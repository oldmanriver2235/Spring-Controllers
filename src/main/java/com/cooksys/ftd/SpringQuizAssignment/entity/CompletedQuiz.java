package com.cooksys.ftd.SpringQuizAssignment.entity;

import java.util.HashMap;

public class CompletedQuiz {

	private String title;
	private HashMap<String, CompletedQuestion> completedQuestions = new HashMap<String, CompletedQuestion>();

	public CompletedQuiz() {
		super();
	}

	public CompletedQuiz(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public HashMap<String, CompletedQuestion> getCompletedQuestions() {
		return completedQuestions;
	}

	public void setCompletedQuestions(HashMap<String, CompletedQuestion> completedQuestions) {
		this.completedQuestions = completedQuestions;
	}

	@Override
	public String toString() {
		return "CompletedQuiz [title=" + title + ", completedQuestions=" + completedQuestions + "]";
	}

}