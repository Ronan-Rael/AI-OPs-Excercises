package com.smartstore.billing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SalaryCalculatorTest {

    @Test
    void testGrossSalaryExactly20000() {
        // Basic salary: 20000 / 1.3
        double actualNetSalary =
                SalaryCalculator.calculateNetSalary(20000.0 / 1.3);

        assertEquals(20000.0, actualNetSalary, 0.001);
    }

    @Test
    void testGrossSalaryAbove20000() {
        // Basic salary producing a gross salary above 20000
        double actualNetSalary =
                SalaryCalculator.calculateNetSalary(50000.0);

        assertEquals(64800.0, actualNetSalary, 0.001);
    }

    @Test
    void testGrossSalary15000() {
        double actualNetSalary =
                SalaryCalculator.calculateNetSalary(15000.0 / 1.3);

        assertEquals(15000.0, actualNetSalary, 0.001);
    }

    @Test
    void testGrossSalary19999() {
        double actualNetSalary =
                SalaryCalculator.calculateNetSalary(19999.0 / 1.3);

        assertEquals(19999.0, actualNetSalary, 0.001);
    }

    @Test
    void testGrossSalaryBelow10000() {
        double actualNetSalary =
                SalaryCalculator.calculateNetSalary(9000.0);

        assertEquals(11700.0, actualNetSalary, 0.001);
    }
}
