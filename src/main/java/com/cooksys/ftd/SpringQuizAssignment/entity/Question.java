package com.cooksys.ftd.SpringQuizAssignment.entity;

import java.util.Set;

public class Question {
	
	private String question;
	
	
	private Answer correctAnswer;
	
	private Set<Answer> answers;
	
	public Question () {}
	
	public Question(String question) {
        this.question = question;
        
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(Answer correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public Set<Answer> getAnswers() {
		return answers;
	}
	
	public void addAnswer(Answer answer) {
		this.answers.add(answer);
	}
	
	public Answer removeAnswer(Answer answer) {
		this.answers.remove(answer);
		return answer;
	}
}