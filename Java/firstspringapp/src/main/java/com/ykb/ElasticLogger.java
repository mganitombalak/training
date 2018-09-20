package com.ykb;

import org.springframework.stereotype.Component;

@Component
public class ElasticLogger implements Logger {
    public void log(String m) {
        System.out.println("ELK:" + m);
    }
}
