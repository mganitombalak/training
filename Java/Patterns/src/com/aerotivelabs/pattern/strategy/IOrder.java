package com.aerotivelabs.pattern.strategy;

public interface IOrder {
    String getShippingCountry();
    String getShippingMethod();
    IStrategy getCargo();
    void setCargo(IStrategy cargo);
    void deliver();
}
