import java.io.File;
import java.util.Scanner;

public class GameModel {
	public GameModel(File dataFile){
		File dataFiles = dataFile;
		retriveGamequestionsFromDataBase(dataFiles);
	}

	private void retriveGamequestionsFromDataBase(File dataFile) {
		// here we are going to read data from database(i,e file contents)
		try (Scanner scanFile = new Scanner(dataFile)) {

			while (scanFile.hasNext()) {
				String temp = scanFile.nextLine();
				String[] tempArr = temp.split("\\s+");

				if (tempArr.length < 3) {
					createQuestionWithAnswer(tempArr[0], tempArr[1]);

				} else {
					createImageWithPath(tempArr[0], tempArr[1]);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void createImageWithPath(String imagePth, String answer) {
		// TODO Auto-generated method stub
		ImageWithAnswer newImage = new ImageWithAnswer(imagePth,answer);
		
	}

	private void createQuestionWithAnswer(String question, String answer) {
		// TODO Auto-generated method stub
		QuestionWithAnswer newQuestion = new QuestionWithAnswer(question,answer);
	}
}
