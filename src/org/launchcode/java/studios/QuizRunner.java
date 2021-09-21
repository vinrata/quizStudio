package org.launchcode.java.studios;

public class QuizRunner {

    public static void main(String[] args) {

	// write your code here
        Quiz myQuiz = new Quiz();
        MultipleChoice myMultipleChoiceQuestion = new MultipleChoice(
                "what sounds does a dog make?\nA: Bark\nB: Quack\nC: Meow\nD: Moo\nPlease type a single letter for answer.", "A");
        myQuiz.addQuestion(myMultipleChoiceQuestion);

        Checkbox myCheckbox = new Checkbox("Select all that apply, which animals can fly?\nA: Penguins\nB: Doves\nC: Eagles\nD: Parrots", "B,C,D");
        myQuiz.addQuestion(myCheckbox);

        TrueFalse myTrueFalse = new TrueFalse("Dog are omnivores\nTrue or False?","True");
        myQuiz.addQuestion(myTrueFalse);

        myQuiz.runQuiz();
    }
}
