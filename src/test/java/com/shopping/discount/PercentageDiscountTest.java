package com.shopping.discount;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PercentageDiscountTest {
    private PercentageDiscount percentageDiscount;
    @Before
    public void setUp() {
        percentageDiscount = new PercentageDiscount();
    }

    @Test
    public void testDiscount() {
        assertEquals(4500,percentageDiscount.applyDiscount(5000),0.001);

    }

}

