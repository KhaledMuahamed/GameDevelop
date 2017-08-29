package controller.mainController;

import model.enums.QuestionTypes;
import model.question.QuestionIF;

public interface mainControllerIF {

    public void LoadChapter(int level);

    public QuestionIF getPrevQuestion();

    public QuestionIF getNextQuestion();

    public QuestionIF getCurrentQuestion();

    public QuestionTypes getQuestionType();

    public String getQuestionTitle();

    public char[] getQuestionAnswer();

    public int getChapterSize();

    public mainControllerImp getInstance();

}
