package com.homework_8.decorator;

public class Mustard implements FoodItems {
    private final FoodItems component;

    public Mustard(FoodItems component) {
        this.component = component;
    }

    public double getCost() {
        return component.getCost() + 0.50;
    }
}
