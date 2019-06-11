package com.aerotivelabs.bridge;

public interface Question {
    void nextQuestion();
    void previousQuestion();
    void newQuestion(String question);
    void deleteQuestion(String question);
    void displayQuestion();
    void displayAllQuestions();
}
