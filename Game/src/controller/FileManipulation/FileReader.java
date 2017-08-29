package controller.FileManipulation;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import model.enums.QuestionTypes;
import model.question.ImageQuestion;
import model.question.QuestionIF;
import model.question.TextQuestion;

public class FileReader {
	// questions in the chapter...
	private ArrayList<QuestionIF> questions;

	public FileReader() {
		questions = new ArrayList<>();
	}

	public QuestionIF[] retriveGamequestionsFromDataBase(File dataFile) {
		// here we are going to read data from database(i,e file contents)
		QuestionIF[] questionArray = null;
		try (Scanner scanFile = new Scanner(dataFile)) {

			while (scanFile.hasNext()) {
				String temp = scanFile.nextLine();
				String[] tempArr = temp.split("\\s+");

				if (tempArr.length < 3) {

					questions.add(new TextQuestion(tempArr[0], tempArr[1].toCharArray(), QuestionTypes.text));

				} else {
					questions.add(new ImageQuestion(tempArr[0], tempArr[1].toCharArray(), QuestionTypes.text));
				}
			}
			questionArray = new QuestionIF[questions.size()];
			questionArray = questions.toArray(questionArray);

		} catch (Exception e) {
			e.printStackTrace();
		}
		// clear the arraylist inorder to avid old data.
		questions.clear();
		return questionArray;

	}
}
