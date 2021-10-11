/*
 *  UCF COP3330 Fall 2021 Assigment 3 Exercise 44 Store Products file
 *  Copyright 2021 Celina Alzenor
 */

package ex44;

public class Products {

    private final String name;
    private final double price;
    private final long quantity;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public long getQuantity() {
        return quantity;
    }

    public Products(String name, double price, long quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
