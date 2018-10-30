package Advice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import Exceptions.QuestionNotFound;

@RestControllerAdvice
public class ControllerAdvice {

	@ExceptionHandler(QuestionNotFound.class)
	public ResponseMessage questionsNotFound(QuestionNotFound e) {
		return new ResponseMessage(e.getMessage());
	}

}
