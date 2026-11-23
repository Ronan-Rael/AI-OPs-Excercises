package com.citypower.billing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ElectricityBillApplicationTest {

    @Test
    void testNegativeUnitsReturnsMinusOne() {
        double actual = ElectricityBillApplication.calculateEnergyCharge(-1);

        assertEquals(-1.0, actual, 0.001);
    }

    @Test
    void testUnitsBelow100() {
        // 50 units × Rs. 3.00 = Rs. 150.00
        double actual = ElectricityBillApplication.calculateEnergyCharge(50);

        assertEquals(150.0, actual, 0.001);
    }

    @Test
    void testUnitsExactly100() {
        // 100 units × Rs. 3.00 = Rs. 300.00
        double actual = ElectricityBillApplication.calculateEnergyCharge(100);

        assertEquals(300.0, actual, 0.001);
    }

    @Test
    void testUnitsAbove100AndBelow300() {
        // First 100 units: 100 × 3 = Rs. 300
        // Remaining 50 units: 50 × 5 = Rs. 250
        // Total = Rs. 550
        double actual = ElectricityBillApplication.calculateEnergyCharge(150);

        assertEquals(550.0, actual, 0.001);
    }

    @Test
    void testUnitsExactly300() {
        // First 100 units: Rs. 300
        // Remaining 200 units: 200 × 5 = Rs. 1000
        // Total = Rs. 1300
        double actual = ElectricityBillApplication.calculateEnergyCharge(300);

        assertEquals(1300.0, actual, 0.001);
    }

    @Test
    void testUnitsAbove300AndBelowSurchargeThreshold() {
        // First 300 units cost Rs. 1300
        // Remaining 50 units: 50 × 7.50 = Rs. 375
        // Total = Rs. 1675
        double actual = ElectricityBillApplication.calculateEnergyCharge(350);

        assertEquals(1675.0, actual, 0.001);
    }

    @Test
    void testSurchargeDoesNotApplyAtExactly2000() {
        double actual = ElectricityBillApplication.calculateSurcharge(2000.0);

        assertEquals(0.0, actual, 0.001);
    }

    @Test
    void testUnitsAboveSurchargeThreshold() {
        // 400 units = Rs. 2050, so the 5% surcharge applies
        double energyCharge =
                ElectricityBillApplication.calculateEnergyCharge(400);
        double actual =
                ElectricityBillApplication.calculateSurcharge(energyCharge);

        assertEquals(2050.0, energyCharge, 0.001);
        assertEquals(102.5, actual, 0.001);
    }
    
    @Test
    void testZeroUnits() {
        double actualCharge =
                ElectricityBillApplication.calculateEnergyCharge(0);

        assertEquals(0.0, actualCharge, 0.001);
    }
}