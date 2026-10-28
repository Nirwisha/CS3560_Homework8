package com.homework_8.decorator;

public class Cheese implements FoodItems {
    private final FoodItems component;

    public Cheese(FoodItems component) {
        this.component = component;
    }

    public double getCost() {
        return component.getCost() + 1.00;
    }
}