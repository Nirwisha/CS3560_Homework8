package com.homework_8.decorator;

public class Ketchup implements FoodItems {
    private final FoodItems component;

    public Ketchup(FoodItems component) {
        this.component = component;
    }

    public double getCost() {
        return component.getCost() + 0.50;
    }
}
