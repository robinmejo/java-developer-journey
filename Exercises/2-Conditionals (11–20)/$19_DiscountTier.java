/*
Exercise 19 of 60 — Compute a Discount Tier

Write a Java program using if-else to calculate the discount
based on the purchase amount.

Rules:
- Purchase amount >= 10000: 20% discount
- Purchase amount >= 5000: 10% discount
- Purchase amount >= 1000: 5% discount
- Purchase amount < 1000: No discount
*/

public class $19_DiscountTier {
    public static void main(String[] args) {
        double purchaseAmount = 6500;
        int discount;

        if (purchaseAmount >= 10000) {
            discount = 20;
        } else if (purchaseAmount >= 5000) {
            discount = 10;
        } else if (purchaseAmount >= 1000) {
            discount = 5;
        } else {
            discount = 0;
        }

        System.out.println("Discount: " + discount + "%");
    }
}