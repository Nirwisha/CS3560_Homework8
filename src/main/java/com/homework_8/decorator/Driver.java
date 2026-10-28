package com.homework_8.decorator;

public class Driver {
    public static void main(String[] args) {
        //create food items
        FoodItems burger = new Burger();
        burger = new Onions(burger);
        burger = new Ketchup(burger);

        FoodItems fries = new Fries();
        fries = new Cheese(fries);

        //add to order
        Order order = new Order();
        order.addItem(burger);
        order.addItem(fries);

        double total = order.getTotalCost();

        Loyalty customer = new Loyalty("Gold");
        double finalTotal = customer.applyDiscount(total);

        System.out.printf("Total: $%.2f%n", total);
        System.out.printf("Total After Discount: $%.2f%n", finalTotal);

    }
}
