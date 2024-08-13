package com.shopping.model;

public class Product {
    private int id;
    private String name;
    private double price;

    public void setProductId(int id) {
        this.id = id;
    }

    public void setProductName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProductId() {
        return id;
    }

    public String getProductName() {
        return name;
    }

    public double getProductPrice() {
        return price;
    }
}
