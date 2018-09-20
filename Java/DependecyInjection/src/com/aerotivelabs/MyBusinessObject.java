package com.aerotivelabs;

public class MyBusinessObject {


    private Logger logger;

    public MyBusinessObject(Logger logger) {
        this.logger = logger;
    }

    public void doSomeComplexThings(){
        System.out.println("Doing something very complex.");
        this.logger.log("complex business done!");
    }
}
