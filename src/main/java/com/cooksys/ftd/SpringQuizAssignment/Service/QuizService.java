package com.cooksys.ftd.SpringQuizAssignment.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.cooksys.ftd.SpringQuizAssignment.entity.CompletedQuestion;
import com.cooksys.ftd.SpringQuizAssignment.entity.CompletedQuiz;
import com.cooksys.ftd.SpringQuizAssignment.entity.Question;
import com.cooksys.ftd.SpringQuizAssignment.entity.Quiz;

@Service
public class QuizService {

	private String name;

	HashMap<String, Quiz> quizzes = new HashMap<>();

	public QuizService() {
		Quiz Quiz = new Quiz("quizOne");
		quizzes.put(Quiz.getTitle(), Quiz);
	}

	public Collection<Quiz> getQuizzes() {
		return this.quizzes.values();
	}

	public Quiz postQuiz(String quizName) {
		Quiz newQuiz = new Quiz(quizName);
		quizzes.put(quizName, newQuiz);
		return newQuiz;
	}

	public Quiz removeQuiz(String quizName) {
		return quizzes.remove(quizName);
	}

	public Quiz patchQuiz(String quizName, String newName) {
		Quiz quizToRename = quizzes.get(quizName);
		quizToRename.setTitle(newName);
		return quizToRename;
	}

	public Question getRandomQuestion(String quizName) {
		HashMap<String, Question> questionsMap = quizzes.get(quizName).getQuestions();
		Random generator = new Random();
		Question[] questions = (Question[]) questionsMap.values().toArray();
		Question randomQuestion = questions[generator.nextInt(questions.length)];
		return randomQuestion;
	}

	public Quiz addQuestion(String quizName, Question question) {
		Quiz quizToBeAltered = quizzes.get(quizName);
		quizToBeAltered.addQuestion(question);
		return quizToBeAltered;
	}

	public Question removeQuestion(String quizName, String question) {
		return quizzes.get(quizName).removeQuestion(question);
	}

	public float calculateGrade(CompletedQuiz completedQuiz) {
		System.out.println(completedQuiz);
		float correctlyAnswered = 0;
		float totalQuestions = completedQuiz.getCompletedQuestions().values().size();
		Quiz templateQuiz = quizzes.get(completedQuiz.getTitle());
		System.out.println(templateQuiz);
		for (CompletedQuestion cq : completedQuiz.getCompletedQuestions().values()) {
			if (cq.getSelectedAnswer().getAnswer().equals(templateQuiz.getQuestions().get(cq.getCompletedQuestion()).getCorrectAnswer().getAnswer())) {
				correctlyAnswered++;
			}
		}
		System.out.println(correctlyAnswered);
		System.out.println(totalQuestions);
		return (correctlyAnswered / totalQuestions) * 100;
	}

}
