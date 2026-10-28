package com.homework_8.decorator;

import java.util.LinkedList;

public class Order {
    // using linked list as an easy way to add() items from the order into a list
    private LinkedList<FoodItems> order = new LinkedList<>();

    public void addItem(FoodItems item) {
        order.add(item);
    }

    /* creating loop to iterate through each item, toppings' price is already calculated/included in each respective class
    so we don't need to sorry about it here */
    public double getTotalCost() {
        double total = 0;

        for (FoodItems item : order) {
            total += item.getCost();
        }

        return total;
    }
    
}
