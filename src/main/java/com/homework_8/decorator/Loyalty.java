package com.homework_8.decorator;

public class Loyalty {
    /* 
    * There are 3 tiers of loyalty: silver, gold, platinum with each applying increasing discounts. 
    * Using if-else to calcualte discounts so that it can check for which discounts to apply, and if
    * the customer has no discounts, nothing gets applied.
    */

    private String status;

    public Loyalty(String status) {
        this.status = status;
    }

    public double applyDiscount(double total) {
        if (status.equalsIgnoreCase("Silver")) {
            return total * 0.98; // 2% off
        }
        else if (status.equalsIgnoreCase("Gold")) {
            return total * 0.92; //8% off
        }
        else if (status.equalsIgnoreCase("Platinum")) {
            return total * 0.88; //12% off
        }
        else {
            return total; //no discount applied
        }
    }
}
