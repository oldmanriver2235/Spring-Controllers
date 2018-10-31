package com.cooksys.ftd.SpringQuizAssignment.Controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.ftd.SpringQuizAssignment.Service.QuizService;
import com.cooksys.ftd.SpringQuizAssignment.entity.CompletedQuiz;
import com.cooksys.ftd.SpringQuizAssignment.entity.Question;
import com.cooksys.ftd.SpringQuizAssignment.entity.Quiz;

@RestController
@RequestMapping("quiz")
public class QuizController {

	private QuizService quizService;

	public QuizController(QuizService quizService) {
		super();
		this.quizService = quizService;
	}

	@GetMapping
	public Collection<Quiz> getQuiz() {
		return this.quizService.getQuizzes();
	}

	@PostMapping("/{quizName}")
	public Quiz postQuiz(@PathVariable String quizName) {
		return this.quizService.postQuiz(quizName);
	}

	@DeleteMapping("/{quizName}")
	public Quiz removeQuiz(@PathVariable String quizName) {
		return this.quizService.removeQuiz(quizName);
	}

	@PatchMapping("/{quizName}/rename/{newName}")
	public Quiz patchQuiz(@PathVariable String quizName, @PathVariable String newName) {
		return this.quizService.patchQuiz(quizName, newName);
	}

	@GetMapping("/{quizName}/random")
	public Question randomQuestion(@PathVariable String quizName) {
		return this.quizService.getRandomQuestion(quizName);
	}

	@PatchMapping("/{quizName}/add")
	public Quiz addQuestion(@PathVariable String quizName, @RequestBody Question question) {
		return this.quizService.addQuestion(quizName, question);
	}

	@DeleteMapping("/{quizName}/delete/{question}")
	public Question deleteQuestion(@PathVariable String quizName, @PathVariable String question) {
		return this.quizService.removeQuestion(quizName, question);
	}

	@PostMapping("/grade")
	public float calculateGrade(@RequestBody CompletedQuiz quiz) {
		return this.quizService.calculateGrade(quiz);
	}

}
