package com.aerotivelabs.pattern.decorator;

public class Main {
    public static void main(String[] args) {
        VegeterianFood veggie = new VegeterianFood();

        System.out.println("Vegeterian Food");
        System.out.println(veggie.prepareFood());
        System.out.println(veggie.foodPrice());
        System.out.println("=============================");

        NonVegeterianFood nonveggie = new NonVegeterianFood(veggie);

        System.out.println("Non Vegeterian Food");
        System.out.println(nonveggie.prepareFood());
        System.out.println(nonveggie.foodPrice());
        System.out.println("=============================");


        ChineeseFood chinese = new ChineeseFood(veggie);

        System.out.println("Chinese Food");
        System.out.println(chinese.prepareFood());
        System.out.println(chinese.foodPrice());
        System.out.println("=============================");
    }
}
