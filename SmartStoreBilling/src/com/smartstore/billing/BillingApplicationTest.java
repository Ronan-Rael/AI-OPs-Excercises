package com.smartstore.billing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BillingApplicationTest {

    @Test
    void testDiscountBelow1000() {
        double actualDiscount =
                BillingApplication.calculateDiscount(800.0);

        assertEquals(0.0, actualDiscount, 0.001);
    }

    @Test
    void testDiscountExactly1000() {
        double actualDiscount =
                BillingApplication.calculateDiscount(1000.0);

        assertEquals(50.0, actualDiscount, 0.001);
    }

    @Test
    void testDiscountAt4999() {
        double actualDiscount =
                BillingApplication.calculateDiscount(4999.0);

        assertEquals(249.95, actualDiscount, 0.001);
    }

    @Test
    void testDiscountExactly5000() {
        double actualDiscount =
                BillingApplication.calculateDiscount(5000.0);

        assertEquals(500.0, actualDiscount, 0.001);
    }

    @Test
    void testDiscountAbove5000() {
        double actualDiscount =
                BillingApplication.calculateDiscount(7000.0);

        assertEquals(700.0, actualDiscount, 0.001);
    }
}
