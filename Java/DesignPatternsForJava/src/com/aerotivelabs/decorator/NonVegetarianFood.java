package com.aerotivelabs.decorator;

public class NonVegetarianFood extends FoodDecorator {
    public NonVegetarianFood(Food pFood) {
        super(pFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " with Chicken Sticks and RoseBeef";
    }

    @Override
    public double foodPrice() {
        return super.foodPrice() + 75.0;
    }
}
