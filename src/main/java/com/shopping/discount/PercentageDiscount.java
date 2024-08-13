package com.shopping.discount;

import com.shopping.model.DiscountStrategy;

public class PercentageDiscount implements DiscountStrategy {
//discountedPrice=totalPrice×(1−0.10)discountedPrice=totalPrice×(1−0.10)

    public double applyDiscount(double totalPrice) {
        return totalPrice*(1-0.10); // apply 10% discount
    }
}
