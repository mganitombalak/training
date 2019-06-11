package com.aerotivelabs.decorator;

public abstract class FoodDecorator implements Food {
    private Food food;

    public FoodDecorator(Food pFood) {
        this.food = pFood;
    }

    @Override
    public String prepareFood() {
        return food.prepareFood();
    }

    @Override
    public double foodPrice() {
        return food.foodPrice();
    }
}
