/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.javatunes.product;

import com.javatunes.billing.Location;
import com.javatunes.billing.TaxCalculator;
import com.javatunes.billing.TaxCalculatorFactory;

import java.util.Collection;

public class Order {
    private final String id;
    private final Location location;
    private double totalCost;

    public Order(String id, Location location) {
        this.id = id;
        this.location = location;
    }

    /**
     * DONE:
     * get the items from the cart and iterate over them, print each item's product code
     * get cart total and print
     */
    public void processCart(ShoppingCart<? extends Product> cart) {
        System.out.println("Order: " + getId() + " contains the following:");

        Collection<? extends Product> cartItems = cart.allItems();
        for (Product product : cartItems) {
            System.out.println(product.getCode());
        }
        this.totalCost = cart.total(); // needed for getTax()
        System.out.println("Order Total: " + getTotalCost());
    }

    public double getTax(){
        TaxCalculator calc = TaxCalculatorFactory.getTaxCalculator(getLocation());
        return calc.taxAmount(getTotalCost());
    }

    public Location getLocation() {
        return location;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public String getId() {
        return id;
    }
}