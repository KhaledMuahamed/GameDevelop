package model.question;

import model.enums.QuestionTypes;

public class TextQuestion implements QuestionIF {

	private String question;
	private char[] answer;
	private QuestionTypes type;

	public TextQuestion(String question, char[] answer, QuestionTypes type) {
		this.setType(type);
		this.setQuestion(question);
		this.setAnswer(answer);
	}


	private void setType(QuestionTypes type) {
		// TODO Auto-generated method stub
		this.type = type;

	}

	private void setAnswer(char[] answer) {
		// TODO Auto-generated method stub
		this.answer = answer;
	}

	private void setQuestion(String question) {
		// TODO Auto-generated method stub
		this.question = question;

	}

	// ************************************************************************
	// get question from file
	// ************************************************************************
	@Override
	public String getQuestion() {
		// TODO Auto-generated method stub
		return question;
	}

	// ************************************************************************
	// get the answer read from file
	// ************************************************************************
	@Override
	public char[] getAnswer() {
		// TODO Auto-generated method stub
		return answer;
	}

	@Override
	public QuestionTypes getType() {
		// TODO Auto-generated method stub
		return type;
	}

}
