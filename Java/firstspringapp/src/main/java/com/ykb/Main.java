package com.ykb;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // LOADING SPRING APPLICATION CONTEXT
        ClassPathXmlApplicationContext myAppContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
//          MyCompexBusinessObject mcbo2 =
//                myAppContext.getBean("cbo", MyCompexBusinessObject.class);
//        mcbo.doSomethingComplex();
//        mcbo.setConnectionString("Mehmet Gani Tombalak");
//        System.out.println(mcbo);
//        System.out.println(mcbo2);
//        System.out.println(mcbo.getConnectionString());
//        System.out.println(mcbo2.getConnectionString());

        while (true) {
            MyCompexBusinessObject mcbo =
                    myAppContext.getBean("cbo", MyCompexBusinessObject.class);
            mcbo.doSomethingComplex();
            TimeUnit.SECONDS.sleep(2);
        }

    }
}
