package com.cooksys.ftd.SpringQuizAssignment.entity;

public class CompletedQuestion {

	private String completedQuestion;

	private Answer selectedAnswer;

	public CompletedQuestion() {
	}

	public CompletedQuestion(String completedQuestion) {
		this.completedQuestion = completedQuestion;
	}

	public String getCompletedQuestion() {
		return completedQuestion;
	}

	public void setCompletedQuestion(String completedQuestion) {
		this.completedQuestion = completedQuestion;
	}

	public Answer getSelectedAnswer() {
		return selectedAnswer;
	}

	public void setSelectedAnswer(Answer selectedAnswer) {
		this.selectedAnswer = selectedAnswer;
	}

}
