package com.cooksys.ftd.SpringQuizAssignment.Exceptions;

public class QuizNotFound extends Exception{

	 private String message;

	    public QuizNotFound() {
	        this.message = "Quiz not found";
	    }

	    @Override
	    public String getMessage() {
	        return message;
	    }

	    public void setMessage(String message) {
	        this.message = message;
	    }
	}

