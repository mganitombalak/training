package com.aerotivelabs.decorator;

public class VegetarianFood implements Food {
    @Override
    public String prepareFood() {
        return "Vegetarian Food";
    }

    @Override
    public double foodPrice() {
        return 59.0;
    }
}
