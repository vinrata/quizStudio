package org.launchcode.java.studios;

public class TrueFalse extends Question{
    //class vars

    //constructs


    public TrueFalse(String question, String answer) {
        super(question, answer);
    }

    //methods
    @Override
    public boolean checkAnswer(String answer){
        //answer = true false TRUE FALSE
        if(answer.toUpperCase().equals(this.getTheAnswer().toUpperCase())){
            return true;
        }else{
            return false;
        }


    }
}
