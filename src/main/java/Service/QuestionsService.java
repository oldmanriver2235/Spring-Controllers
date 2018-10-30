package Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import Exceptions.QuestionNotFound;

@Service
public class QuestionsService {

	// real bad code
	private List<Question> questions = new ArrayList<>();

	public QuestionsService() {
		this.questions.add(new Question("How many feet are in a mile?"));
		this.questions.add(new Question("How many oceans are in the world?"));
		this.questions.add(new Question("What is the capitol of Tennessee?"));
		this.questions.add(new Question("Which type of bear is best?"));
	}

	// real code
	public List<Question> getQuestion() {
		return this.questions;
	}

	private boolean questionsExists(Question question) {
	        for ( Question q : questions) {
	            if (question.getQuestion().equalsIgnoreCase(q.getQuestion())) {
	                return true;
	            }
	        }
	        return false;
	    }

	public Question getQuestions(Question question) throws QuestionNotFound {
		for (Question q : questions) {
			if (question.getQuestion().equalsIgnoreCase(q.getQuestion())) {
				return question;
			}
		}
		throw new QuestionNotFound();
	}

	public boolean addQuestions(Question questions) throws QuestionNotFound {
		if (!questionsExists(questions)) {
			return this.questions.add(questions);
		}
		return false;
	}

	public Question deleteQuestions(String question) {
		for (int i = 0; i < this.questions.size(); i++) {
			if (this.questions.get(i).getQuestion().equalsIgnoreCase(question)) {
				return this.questions.remove(i);
			}
		}
		return null;
	}
}
