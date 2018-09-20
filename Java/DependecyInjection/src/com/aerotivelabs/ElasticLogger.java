package com.aerotivelabs;

public class ElasticLogger  implements Logger{
    public void log(String message) {
        System.out.println("elk-log-message:" + message);
    }
}
