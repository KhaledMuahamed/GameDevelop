package model;

import java.util.ArrayList;

public class Chapter {

    private Questions[] questions;
    private Character[] keyWord;
    public Chapter(Questions[] questions){
            this.questions = questions;
            getKeyWordArray();
    }
    public Character[] getAnswer(int number){
        return this.questions[number].getAnswer();
    }
    public Questions getQuestion(int number){
        return this.questions[number];
    }
    public Character[] getKeyWord(){
        return this.keyWord;
    }
    private void getKeyWordArray(){
        ArrayList<Character> keyWordList = new ArrayList<>();
        for(Question q : questions){
            keyWordList.add(q.getKeyCharacter());
        }
        keyWordList.toArray(keyWord);
    }
}
