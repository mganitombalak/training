package com.aerotivelabs;

public class ConsoleLogger implements Logger{

    @Override
    public void log(String message) {
        System.out.println("log-message:" + message);
    }
}
