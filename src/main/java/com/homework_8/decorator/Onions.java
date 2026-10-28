package com.homework_8.decorator;

public class Onions implements FoodItems {
    private final FoodItems component;

    public Onions(FoodItems component) {
        this.component = component;
    }

    public double getCost() {
        return component.getCost() + 1.20;
    }
}
