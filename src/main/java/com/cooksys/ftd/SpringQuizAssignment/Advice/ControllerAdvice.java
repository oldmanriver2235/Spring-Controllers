package com.cooksys.ftd.SpringQuizAssignment.Advice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cooksys.ftd.SpringQuizAssignment.Exceptions.QuestionNotFound;
import com.cooksys.ftd.SpringQuizAssignment.Exceptions.QuizNotFound;

@RestControllerAdvice
public class ControllerAdvice {

	@ExceptionHandler(QuestionNotFound.class)
	public ResponseMessage questionsNotFound(QuestionNotFound e) {
		return new ResponseMessage(e.getMessage());
	}
	@ExceptionHandler(QuizNotFound.class)
	public ResponseMessage quizNotFound(QuizNotFound e) {
		return new ResponseMessage(e.getMessage());
	}
}
