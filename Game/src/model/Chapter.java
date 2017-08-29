package model;

import model.question.QuestionIF;

public class Chapter {
	// chapter should has a group of questions
	private QuestionIF[] questions;

	public Chapter(QuestionIF[] questions) {
		this.questions = questions;
	}

	public char[] getAnswer(int number) {
		return this.questions[number].getAnswer();
	}

	public QuestionIF getQuestion(int number) {
		return this.questions[number];
	}
}
