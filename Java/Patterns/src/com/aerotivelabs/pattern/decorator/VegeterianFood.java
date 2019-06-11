package com.aerotivelabs.pattern.decorator;

public class VegeterianFood implements Food {
    @Override
    public String prepareFood() {
        return "Vegeterian food";
    }

    @Override
    public double foodPrice() {
        return 29.90;
    }
}
