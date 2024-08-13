package com.shopping.discount;
import com.shopping.model.DiscountStrategy;
import com.shopping.model.ShoppingCart;

public class FixedAmountDiscount implements DiscountStrategy {
//FixedAmountDiscount applies a fixed amount discount if the total price exceeds a certain threshold.
    public double applyDiscount(double totalPrice) {
        if (totalPrice > 100) {
            totalPrice = totalPrice / 2;
        }
        return totalPrice;

    }
}
