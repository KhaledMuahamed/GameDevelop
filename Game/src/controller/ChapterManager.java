package controller;

import model.Chapter;

public class ChapterManager {
    private Chapter chapter;
    private Character[] colllectedWord;
    ChapterManager(Chapter chapter){
        this.chapter = chapter;
        colllectedWord = new Character[chapter.getKeyWord().length];
    }

    public Question getQuestion(int number){
        return null;
    }

    public Question[] getQuestions(){
        return null;
    }
    public Character[] getAnswer(int number){
        return null;
    }
    public Character[][] getAnswers(){
        return null;
    }
    public Character[] getKeyWord(){
        return null;
    }
    public void addKeyCharacter(int number,Character key){
        colllectedWord[number] = key;
    }



}
