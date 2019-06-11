package com.aerotivelabs.strategy;

public class Order implements IOrder {
    private String shippingCountry;
    private String shippingMethod;
    private IStrategy cargo;

    public Order(String shippingCountry, String shippingMethod) {
        this.shippingCountry = shippingCountry;
        this.shippingMethod = shippingMethod;
    }

    @Override
    public String getShippingCountry() {
        return shippingCountry;
    }

    @Override
    public String getShippingMethod() {
        return shippingMethod;
    }

    public IStrategy getCargo() {
        return cargo;
    }

    public void setCargo(IStrategy cargo) {
        this.cargo = cargo;
    }

    @Override
    public void deliver() {
        this.cargo.deliver();
    }
}
