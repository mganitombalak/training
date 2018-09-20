package com.ykb;


import org.springframework.stereotype.Component;

@Component
public class OracleLogger implements Logger {

//    private void init() {
//        System.out.println("Oracle class initialized.");
//    }
//
//    private void destroy() {
//        System.out.println("Oracle class destroyed.");
//    }

    public void log(String m) {
        System.out.println("ORA:" + m);
    }
}
