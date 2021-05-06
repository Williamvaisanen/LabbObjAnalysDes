package shop;

import java.math.BigDecimal;

public class DiscountHandler {

    public BigDecimal calculateDiscount(ShoppingCart shoppingCart) {

        BigDecimal discountAmount = BigDecimal.ZERO;

        DiscountThreeForTwo discountThreeForTwo = new DiscountThreeForTwo();

        DiscountTen discountTen = new DiscountTen();
        
        DiscountCheapestForFree discountCheapestForFree = new DiscountCheapestForFree();

        discountAmount = discountAmount.add(discountThreeForTwo.calculateDiscount(shoppingCart));
        discountAmount = discountAmount.add(discountTen.calculateDiscount(shoppingCart));
        discountAmount = discountAmount.add(discountCheapestForFree.calculateDiscount(shoppingCart));

        return discountAmount;
    }

}