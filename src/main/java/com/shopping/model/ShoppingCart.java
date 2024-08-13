package com.shopping.model;

import java.util.HashMap;

public class ShoppingCart {
    HashMap<String, Double> shoppingCart;

    public ShoppingCart() {
        shoppingCart = new HashMap<String, Double>();
    }
    public void add(String item, double price) {
        shoppingCart.put(item, price);
    }

    public double getPrice(String item) {
        return shoppingCart.get(item);
    }

    public void remove(String item) {
        shoppingCart.remove(item);
    }

    public String[] viewCart() {
        return (shoppingCart.keySet()).toArray(new String[0]); // prints out the products names and converting to array
    }

    public double totalPrice() {
        double total = 0;
        for(double price : shoppingCart.values()) {
            total += price;
        }
        return total;
    }
}
