package com.aerotivelabs;

public class Main {

    public static void main(String[] args) {

        Logger logger = new ElasticLogger();
        MyBusinessObject mbo = new MyBusinessObject(logger);
        mbo.doSomeComplexThings();
    }
}
