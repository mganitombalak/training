package com.aerotivelabs.bridge;

import java.util.ArrayList;
import java.util.List;

public class JavaQuestions implements Question {

    private List<String> questions = new ArrayList<>();
    private int index = 0;

    public JavaQuestions() {
        questions.add("What is class?");
        questions.add("What is inheritance?");
        questions.add("How many types of inheritance are there?");
        questions.add("What are the differences between class and interface");
    }

    @Override
    public void nextQuestion() {
        if (index <= questions.size() - 1) {
            index++;
        }
    }

    @Override
    public void previousQuestion() {
        if (index > 0) {
            index--;
        }
    }

    @Override
    public void newQuestion(String question) {
        questions.add(question);
    }

    @Override
    public void deleteQuestion(String question) {
        questions.remove(question);
    }

    @Override
    public void displayQuestion() {
        System.out.println(questions.get(index));
    }

    @Override
    public void displayAllQuestions() {
        questions.forEach(System.out::println);
    }
}
