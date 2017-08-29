package controller.mainController;

import controller.ChapterManager;
import controller.ResourcesManager;
import model.enums.QuestionTypes;
import model.question.QuestionIF;

public class mainControllerImp implements  mainControllerIF {

    private static mainControllerImp manager;
    private ResourcesManager resourcesManager;
    private ChapterManager currentChapterManager;
    private int currentPuzzle;

    private mainControllerImp(){
        resourcesManager = ResourcesManager.getInstance();
    }

    @Override
    public void LoadChapter(int level) {
        currentChapterManager = resourcesManager.loadChapter(level);
        currentPuzzle = 0;
    }

    @Override
    public QuestionIF getPrevQuestion() {
        if(currentPuzzle > 0)
            currentPuzzle--;
        return getCurrentQuestion();
    }

    @Override
    public QuestionIF getNextQuestion() {
        if(currentPuzzle+1 == currentChapterManager.getChapterSize())
            currentPuzzle++;
        return getCurrentQuestion();
    }

    @Override
    public QuestionIF getCurrentQuestion() {
        return currentChapterManager.getQuestion(currentPuzzle);
    }

    @Override
    public QuestionTypes getQuestionType() {
        return getCurrentQuestion().getType();
    }

    @Override
    public String getQuestionTitle() {
        return getCurrentQuestion().getQuestion();
    }

    @Override
    public char[] getQuestionAnswer() {
        return getCurrentQuestion().getAnswer();
    }

    @Override
    public int getChapterSize() {
        return currentChapterManager.getChapterSize();
    }

    @Override
    public mainControllerImp getInstance(){
        if(manager == null){
            manager = new mainControllerImp();
        }
        return manager;
    }
}
