package com.aerotivelabs.pattern.strategy;

public class Main {
    public static void main(String[] args) {
        Order o = new Order("Internal","Parcel");
        Order o2 = new Order("External","Parcel");
        Order o3 = new Order("External","Ship");

        OrderDeliveryManager odm = new OrderDeliveryManager();

        odm.ScanOrder(o);
        odm.ScanOrder(o2);
        odm.ScanOrder(o3);

        o.deliver();
        o2.deliver();
        o3.deliver();


    }
}
