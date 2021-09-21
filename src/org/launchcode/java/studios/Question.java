package org.launchcode.java.studios;

public abstract class Question {

    private String theQuestion;
    private String theAnswer;
    private Double grade;

    //constructors
    public Question(String question, String answer){
        this.theQuestion = question;
        this.theAnswer = answer;
    }

    //getters
    public String getTheQuestion(){return theQuestion;}
    public String getTheAnswer(){return theAnswer;}


    //methods
public abstract boolean checkAnswer(String answer);


}
