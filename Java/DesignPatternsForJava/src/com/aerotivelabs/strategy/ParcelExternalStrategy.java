package com.aerotivelabs.strategy;

public class ParcelExternalStrategy extends ExternalStrategy {

    @Override
    public void deliver() {
        super.deliver();
        System.out.println(" and order will be delivered by parcel");
    }
}
