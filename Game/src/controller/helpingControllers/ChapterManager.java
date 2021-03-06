package controller.helpingControllers;

import model.Chapter;
import model.question.QuestionIF;

public class ChapterManager {
	private Chapter chapter;

	ChapterManager(Chapter chapter) {
		this.chapter = chapter;
	}

	public QuestionIF getQuestion(int number) {
		return this.chapter.getQuestion(number);
	}

	public boolean verifyAnswer(int number, char[] userAnswer) {
		String realAnswer = this.chapter.getAnswer(number).toString();
		String triedAnswer = userAnswer.toString();
		return realAnswer.equals(triedAnswer);
	}
	public int getChapterSize(){
		return this.chapter.getQuestionsSize();
	}

}
