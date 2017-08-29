package testing;

import controller.helpingControllers.ChapterManager;
import controller.helpingControllers.ResourcesManager;
import model.question.QuestionIF;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourcesManager resManager = ResourcesManager.getInstance();
		// load chapter1
		ChapterManager chManager = resManager.loadChapter(1);

		QuestionIF q = chManager.getQuestion(0);

		System.out.println(q.getQuestion());

	}

}
