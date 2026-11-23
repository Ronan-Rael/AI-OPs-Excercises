package com.citypower.billing;

import java.util.Scanner;

public class ElectricityBillApplication {
    public static final int FIRST_SLAB_LIMIT = 100;
    public static final int SECOND_SLAB_LIMIT = 300;

    public static final double FIRST_SLAB_RATE = 3.00;
    public static final double SECOND_SLAB_RATE = 5.00;
    public static final double THIRD_SLAB_RATE = 7.50;

    public static final double FIXED_MONTHLY_CHARGE = 50.00;
    public static final double SURCHARGE_LIMIT = 2000.00;
    public static final double SURCHARGE_RATE = 0.05;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter consumer number: ");
        String consumerNumber = scanner.nextLine();

        System.out.print("Enter consumer name: ");
        String consumerName = scanner.nextLine();

        double previousReading = readMeterReading(
                scanner,
                "Enter previous meter reading: ",
                null);

        double currentReading = readMeterReading(
                scanner,
                "Enter current meter reading: ",
                previousReading);

        double unitsConsumed = currentReading - previousReading;
        double units = unitsConsumed;

        double energyCharge = calculateEnergyCharge(units);
        double surcharge = calculateSurcharge(energyCharge);
        double totalAmount = calculateTotal(energyCharge, surcharge);

        printBill(consumerNumber, consumerName, unitsConsumed,
                energyCharge, surcharge, totalAmount);

        scanner.close();
    }

    private static double readMeterReading(Scanner scanner,
                                           String prompt,
                                           Double previousReading) {
        while (true) {
            System.out.print(prompt);

            if (!scanner.hasNextDouble()) {
                System.out.println("Error: Please enter a valid number.");
                scanner.nextLine();
                continue;
            }

            double reading = scanner.nextDouble();
            scanner.nextLine();

            if (Double.isNaN(reading) || Double.isInfinite(reading)
                    || reading < 0) {
                System.out.println("Error: Meter reading must be a finite "
                        + "non-negative number.");
                continue;
            }

            if (previousReading != null
                    && reading < previousReading) {
                System.out.println("Error: Current meter reading cannot be less "
                        + "than the previous meter reading.");
                continue;
            }

            return reading;
        }
    }

    public static double calculateEnergyCharge(double units) {
        if (units < 0) { // Error condition for testing
            return -1.0;
        }

        double energyCharge = 0.0;

        if (units <= FIRST_SLAB_LIMIT) {
            energyCharge = units * FIRST_SLAB_RATE;
        } else if (units <= SECOND_SLAB_LIMIT) {
            energyCharge = (FIRST_SLAB_LIMIT * FIRST_SLAB_RATE)
                    + ((units - FIRST_SLAB_LIMIT) * SECOND_SLAB_RATE);
        } else {
            energyCharge = (FIRST_SLAB_LIMIT * FIRST_SLAB_RATE)
                    + ((SECOND_SLAB_LIMIT - FIRST_SLAB_LIMIT)
                            * SECOND_SLAB_RATE)
                    + ((units - SECOND_SLAB_LIMIT) * THIRD_SLAB_RATE);
        }

        return energyCharge;
    }

    public static double calculateSurcharge(double energyCharge) {
        if (energyCharge > SURCHARGE_LIMIT) {
            return energyCharge * SURCHARGE_RATE;
        }

        return 0.0;
    }

    public static double calculateTotal(double energyCharge, double surcharge) {
        return energyCharge + FIXED_MONTHLY_CHARGE + surcharge;
    }

    public static void printBill(String consumerNumber,
                                 String consumerName,
                                 double unitsConsumed,
                                 double energyCharge,
                                 double surcharge,
                                 double totalAmount) {
        System.out.println("\n--- CityPower Electricity Bill ---");
        System.out.println("Consumer Number: " + consumerNumber);
        System.out.println("Consumer Name: " + consumerName);
        System.out.printf("Units Consumed: %.2f%n", unitsConsumed);
        System.out.printf("Energy Charge: Rs. %.2f%n", energyCharge);
        System.out.printf("Fixed Monthly Charge: Rs. %.2f%n",
                FIXED_MONTHLY_CHARGE);
        System.out.printf("Surcharge: Rs. %.2f%n", surcharge);
        System.out.printf("Total Amount: Rs. %.2f%n", totalAmount);
    }
}
