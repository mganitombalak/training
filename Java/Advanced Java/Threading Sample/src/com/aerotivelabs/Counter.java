package com.aerotivelabs;

public class Counter {

    public int getValue() {
        return value;
    }

    private int value=0;

    public synchronized void Increment()
    {
        this.value++;
    }

    public synchronized void Decrement()
    {
        this.value--;
    }

}
