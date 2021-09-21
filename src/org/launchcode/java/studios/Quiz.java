package org.launchcode.java.studios;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    //class variables
    private ArrayList<Question> questions = new ArrayList<Question>();
    int numberOfQuestionsCorrect = 0;
    private Scanner scanner = new Scanner(System.in);


    //constructors
    public Quiz(){

    }
    //methods
    public void addQuestion(Question question){
        this.questions.add(question);
    }
    public void runQuiz(){
        //loop through each question
        for (Question question : questions){
            //ask question,
            System.out.println(question.getTheQuestion());
            // get answer
            String usersAnswer = this.getUsersAnswers();
            // check answer
            boolean userGotQuestionCorrect = question.checkAnswer(usersAnswer);
            //Increment numberOfQuestionsCorrect if answered correctly
            if(userGotQuestionCorrect){
                this.numberOfQuestionsCorrect++;
            }
        }

        //grade the quiz
        double percentageCorrect = ((double) this.numberOfQuestionsCorrect / (double) this.questions.size())*100;
        System.out.println("Users Grade: "+ percentageCorrect + "%");
    }

    private String getUsersAnswers(){
        String usersAnswer = scanner.nextLine();
        return usersAnswer;
    }
}
