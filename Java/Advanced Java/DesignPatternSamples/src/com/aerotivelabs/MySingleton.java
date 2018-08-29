package com.aerotivelabs;

public class MySingleton {


    private static MySingleton instance;

    public static MySingleton getInstance(){
        if(instance==null){
            instance = new MySingleton();
        }
        return instance;
    }

    private MySingleton() {
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }

    private String Value;
}