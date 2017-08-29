package controller;

import java.io.File;

import controller.FileManipulation.FileReader;
import model.Chapter;
import model.question.QuestionIF;

/**
 * This class is responsible for getting the data for the manager of the
 * interface.
 *
 *
 */
public class ResourcesManager {
	private static ResourcesManager manager;
	private FileReader readFile;

	private ResourcesManager() {
		readFile = new FileReader();
	}

	public ChapterManager loadChapter(int level) {
		File dataFile = new File(Integer.toString(level) + ".txt");
		QuestionIF[] questions = readFile.retriveGamequestionsFromDataBase(dataFile);
		Chapter chapter = new Chapter(questions);
		return new ChapterManager(chapter);
	}

	public static ResourcesManager getInstance() {
		if (manager == null) {
			manager = new ResourcesManager();
		}
		return manager;
	}
}
