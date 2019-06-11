package com.aerotivelabs.pattern.decorator;

public class NonVegeterianFood extends FoodDecorator {

    public NonVegeterianFood(Food food) {
        super(food);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " with Chicken Sticks and RoseBeef";
    }

    @Override
    public double foodPrice() {
        return super.foodPrice() + 25.0;
    }
}
