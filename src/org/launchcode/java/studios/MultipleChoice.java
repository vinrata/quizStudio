package org.launchcode.java.studios;

public class MultipleChoice extends Question{
//class variables


//constructors
    public MultipleChoice(String question, String answer) {
        super(question, answer);
    }
//methods
    @Override
    public boolean checkAnswer(String answer) {
        // ansewr = a or b
        String actualAnswer = this.getTheAnswer();
        if(answer.toUpperCase().equals(actualAnswer.toUpperCase())){
            return true;
        }else{
            return false;
        }
    }
}
