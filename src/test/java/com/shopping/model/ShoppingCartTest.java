package com.shopping.model;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


public class ShoppingCartTest {
    private ShoppingCart shoppingCart;

    @Before
    public void setUp() {
        shoppingCart = new ShoppingCart();
    }

    @Test
    public void testAddItem() {
        shoppingCart.add("Laptop",2500.50);
        shoppingCart.add("Headset",150);

        assertEquals(2500.50,shoppingCart.getPrice("Laptop"),0.001);
    }

    @Test
    public void testRemoveItem() {
        shoppingCart.add("Laptop",2500.50);
        shoppingCart.add("Headset",150);

        shoppingCart.remove("Laptop");
        //assertEquals(0,shoppingCart.getPrice("Laptop"),0.001);
    }

    @Test
    public void testViewCart() {
        shoppingCart.add("Laptop",2500.50);
        shoppingCart.add("Headset",150);
        shoppingCart.add("Mouse",25.30);
        shoppingCart.add("Keyboard",25.44);

        String [] expected = {"Laptop", "Headset", "Mouse", "Keyboard"};
       assertEquals(expected,shoppingCart.viewCart());
    }

    @Test
    public void testTotalPrice() {
        shoppingCart.add("Laptop",2500.50);
        shoppingCart.add("Headset",150);
        shoppingCart.add("Mouse",25.30);
        shoppingCart.add("Keyboard",25.44);
        shoppingCart.add("Screen",1700.56);

        double expected=(2500.50+150+25.30+25.44+1700.56);

        assertEquals(expected,shoppingCart.totalPrice(),0.001);

    }
}