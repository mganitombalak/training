package com.ykb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClassConfig {
    public static void main(String[] args) {
        ApplicationContext ctx
                = new AnnotationConfigApplicationContext(AppConfig.class);

        MyCompexBusinessObject mbo = ctx.getBean("mbo",MyCompexBusinessObject.class);
        mbo.doSomethingComplex();
    }
}
