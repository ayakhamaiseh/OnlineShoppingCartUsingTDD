package com.shopping.model;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class ProductTest {
    private Product product;

    @Before
    public void setUp() {
        product = new Product();
    }

    @Test
    public void testSetAndGetProductId() {
        int id = 1;
        product.setProductId(id);
        assertEquals(id, product.getProductId());
    }

    @Test
    public void testSetAndGetProductName() {
        String name = "Laptop";
        product.setProductName(name);
        assertEquals(name, product.getProductName());
    }

    @Test
    public void testSetAndGetPrice() {
        int price = 999;
        product.setPrice(price);
        assertEquals(price, product.getProductPrice());
    }
}
