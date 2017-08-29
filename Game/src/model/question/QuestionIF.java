package model.question;

import model.enums.QuestionTypes;

public interface QuestionIF {

	// ************************************************************************
	// 				get the question read from file
	// ************************************************************************
	public String getQuestion();
	// ************************************************************************
	// 				get the question answer
	// ************************************************************************
	public char[] getAnswer();
	// ************************************************************************
	//				 get the question type(image or text)
	// ************************************************************************
	public QuestionTypes getType();

}