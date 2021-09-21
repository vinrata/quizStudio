package org.launchcode.java.studios;

public class Checkbox extends Question{

    //class vars

    //constructs


    public Checkbox(String question, String answer) {
        super(question, answer);
    }

    //methods
    @Override
    public boolean checkAnswer(String answer){
        //ansewr = a, b c or A  B C

        String actualAnswer = this.getTheAnswer();
        if(answer.toUpperCase().equals(actualAnswer.toUpperCase())){
            return true;
        } else {
            return false;
        }
    }
}
