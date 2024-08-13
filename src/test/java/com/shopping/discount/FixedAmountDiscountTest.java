package com.shopping.discount;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class FixedAmountDiscountTest {
    private FixedAmountDiscount fixedAmountDiscount;
    @Before
    public void setUp() {
        fixedAmountDiscount = new FixedAmountDiscount();
    }

    @Test
    public void testDiscount() {
        //double totalPrice=5000
        //double expected = 2500
        assertEquals(2500,fixedAmountDiscount.applyDiscount(5000),0.001);
        assertEquals(90,fixedAmountDiscount.applyDiscount(90),0.001);

    }

}

