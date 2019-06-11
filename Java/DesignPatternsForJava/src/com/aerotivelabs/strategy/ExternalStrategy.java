package com.aerotivelabs.strategy;

public class ExternalStrategy implements IStrategy {
    @Override
    public void deliver() {
        System.out.print("Order has been marked as External cargo");
    }
}
