package com.smartstore.billing;

import java.util.Scanner;

public class BillingApplication {
	
	public static boolean isNumeric(String s) {
		if (s == null || s.isEmpty()) {
			return false;
		}
		try{
			Double.parseDouble(s);
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();
        
        
        System.out.print("Enter product price: ");
        String productPriceS = scanner.nextLine();
        while(!isNumeric(productPriceS) || Double.parseDouble(productPriceS) < 0) {
        	System.out.print("Enter a valid product price (>= 0 and numeric): ");
        	productPriceS = scanner.nextLine();
        }
        double productPrice = Double.parseDouble(productPriceS);

        System.out.print("Enter quantity: ");
        String quantityS= scanner.nextLine();
        while(!isNumeric(quantityS) || Double.parseDouble(quantityS) < 0) {
        	System.out.print("Enter a valid product quantity (>= 0 and numeric): ");
        	quantityS = scanner.nextLine();
        }
        double quantity = Double.parseDouble(quantityS);
       

        double totalAmount = productPrice * quantity;
        double discountAmount = calculateDiscount(totalAmount);
        double finalAmount = totalAmount - discountAmount;

        printBill(customerName, productName, totalAmount,
                discountAmount, finalAmount);

        scanner.close();
    }

    public static double calculateDiscount(double totalAmount) {
        double discountPercentage = 0.0;

        // Apply 5% discount between Rs. 1000 and Rs. 4999
        if (totalAmount >= 1000.0 && totalAmount < 5000.0) {
            discountPercentage = 5.0;
        }
        // Apply 10% discount for Rs. 5000 and above
        else if (totalAmount >= 5000.0) {
            discountPercentage = 10.0;
        }

        // Convert the percentage into the discount amount in rupees
        return totalAmount * discountPercentage / 100.0;
    }

    public static void printBill(String customerName, String productName,
                                 double totalAmount, double discountAmount,
                                 double finalAmount) {
        double discountPercentage = 0.0;

        if (totalAmount >= 1000.0 && totalAmount < 5000.0) {
            discountPercentage = 5.0;
        } else if (totalAmount >= 5000.0) {
            discountPercentage = 10.0;
        }

        System.out.println("\n--- SmartStore Bill ---");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Product Name: " + productName);
        System.out.printf("Total Amount: Rs. %.2f%n", totalAmount);
        System.out.printf("Discount Percentage: %.0f%%%n", discountPercentage);
        System.out.printf("Discount Amount: Rs. %.2f%n", discountAmount);
        System.out.printf("Final Amount: Rs. %.2f%n", finalAmount);
    }
}
