package com.aerotivelabs;

import java.util.List;

public class Squared implements Runnable {

    List<Double> intArr;

    public Squared(List<Double> args) {
        this.intArr = args;
    }

    @Override
    public void run() {
        this.intArr.replaceAll(i->Math.pow(i,2));
    }
}
