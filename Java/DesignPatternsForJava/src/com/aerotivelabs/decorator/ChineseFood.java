package com.aerotivelabs.decorator;

public class ChineseFood extends FoodDecorator {
    public ChineseFood(Food pFood) {
        super(pFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " with Fried Rice + Tom Yum";
    }

    @Override
    public double foodPrice() {
        return super.foodPrice() + 23.0;
    }
}
