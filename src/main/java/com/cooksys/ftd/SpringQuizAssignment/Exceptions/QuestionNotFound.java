package com.cooksys.ftd.SpringQuizAssignment.Exceptions;

public class QuestionNotFound extends Exception{
	

	    private String message;

	    public QuestionNotFound() {
	        this.message = "Question not found";
	    }

	    @Override
	    public String getMessage() {
	        return message;
	    }

	    public void setMessage(String message) {
	        this.message = message;
	    }
	}


