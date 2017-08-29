package controller.mainController;

import model.enums.QuestionTypes;
import model.question.QuestionIF;

public interface mainControllerIF {

    /**
     *  This method mainly used to load the Chapter which contains a set of questions to be showed to the
     *  user, when he push on any footstep button.
     *
     *  @param level : the number of the footstep, e.g. 1 for first, 2 for second, ...etc.
     *
     * */
    public void LoadChapter(int level);

    /**
     *  This method is used to go back by one step to see the previous question, if the user push BACK button.
     *
     * */

    public QuestionIF getPrevQuestion();

    /**
     *  This method is used to go forward by one step to see the previous question, if the user push NEXT button.
     *
     * */

    public QuestionIF getNextQuestion();

    /**
     *  This method is used to get the Current Question showed to the user.
     *
     * */

    public QuestionIF getCurrentQuestion();

    /**
     *  Used to get the type of the Question, if it's an image question or text question.
     *
     * @return an enum, that tells the type of the question.
     *
     * */

    public QuestionTypes getQuestionType();

    /**
     * Used to get the title of the question.
     *
     * @return in case of image question, it will return the path of the image to view in image view,
     *          but in case of text question, it will return the question itself.
     *
     * */
    public String getQuestionTitle();

    /**
     * Used to get the answer of the question showed to the user.
     *
     * @return array of char that contains every char in the answer.
     *
     * */

    public char[] getQuestionAnswer();

    /**
     *  Used to get the number of questions that will be asked in this chapter.
     *
     * @return number of the questions, of current chapter.
     * */

    public int getChapterSize();

    /**
     * Used to verify the answer that user gave us, and the current correct answer.
     *
     * @return true, if the answer is correct, false, if it's wrong.
     *
     * */

    public boolean verifyAnswer(char[] userAnswer);

    /**
     *  Singleton design pattern, to get one instance of the object mainControllerImp.
     *
     * */
    public mainControllerImp getInstance();

}
