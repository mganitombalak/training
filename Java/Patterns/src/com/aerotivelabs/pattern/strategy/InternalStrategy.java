package com.aerotivelabs.pattern.strategy;

public class InternalStrategy implements IStrategy {
    @Override
    public void deliver() {
        System.out.println("Order has been marked as Internal Cargo and order will be delivered by truck");
    }
}
