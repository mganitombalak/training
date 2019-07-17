package com.aerotivelabs.pattern.strategy;

public class ShipExternalStrategy extends ExternalStrategy {

    @Override
    public void deliver() {
        super.deliver();
        System.out.println(" and order will be delivered by ship");
    }
}