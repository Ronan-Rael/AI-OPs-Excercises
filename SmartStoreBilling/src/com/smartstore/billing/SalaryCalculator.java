package com.smartstore.billing;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();

        double grossSalary = calculateGross(basicSalary);
        double professionalTax =
                calculateProfessionalTax(grossSalary);
        double netSalary = calculateNetSalary(basicSalary);

        printSalary(employeeId, employeeName, basicSalary,
                grossSalary, professionalTax, netSalary);

        scanner.close();
    }

    public static double calculateGross(double basicSalary) {
        // HRA is 20% and DA is 10% of basic salary
        double hra = basicSalary * 20 / 100;
        double da = basicSalary * 10 / 100;

        return basicSalary + hra + da;
    }

    // Calculates professional tax based on gross salary
    public static double calculateProfessionalTax(double grossSalary) {
        if (grossSalary > 20000.0) {
            return 200.0;
        }

        return 0.0;
    }
    
    // Calculates the net salary based on the basic salary
    public static double calculateNetSalary(double basicSalary) {
    	double gross = calculateGross(basicSalary);
    	return gross - calculateProfessionalTax(gross);
    }

    public static void printSalary(int employeeId, String employeeName,
                                   double basicSalary, double grossSalary,
                                   double professionalTax,
                                   double netSalary) {
        double hra = basicSalary * 20 / 100;
        double da = basicSalary * 10 / 100;

        System.out.println("\n--- Employee Salary Details ---");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.printf("Basic Salary: Rs. %.2f%n", basicSalary);
        System.out.printf("HRA (20%%): Rs. %.2f%n", hra);
        System.out.printf("DA (10%%): Rs. %.2f%n", da);
        System.out.printf("Gross Salary: Rs. %.2f%n", grossSalary);
        System.out.printf("Professional Tax: Rs. %.2f%n", professionalTax);
        System.out.printf("Net Salary: Rs. %.2f%n", netSalary);
    }
}
