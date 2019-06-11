package com.aerotivelabs.pattern.decorator;

public class ChineeseFood extends FoodDecorator {
    public ChineeseFood(Food food) {
        super(food);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " with Fried Rice + Tom Yum";
    }

    @Override
    public double foodPrice() {
        return super.foodPrice() + 18.0;
    }
}
