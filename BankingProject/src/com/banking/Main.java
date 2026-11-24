package com.banking;
import java.util.Scanner;
import com.banking.model.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("====================================\r\n"
					+ "       BANKING MANAGEMENT SYSTEM\r\n"
					+ "====================================\r\n"
					+ "\r\n"
					+ "1. Create Customer\r\n"
					+ "2. Create Bank Account\r\n"
					+ "3. View Customer Details\r\n"
					+ "4. Deposit Money\r\n"
					+ "5. Withdraw Money\r\n"
					+ "6. Check Account Balance\r\n"
					+ "7. Transfer Money\r\n"
					+ "8. View Transaction History\r\n"
					+ "9. Exit\r\n"
					+ "\r\n"
					+ "Enter your choice:");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Creating customer.");
			case 2:
				System.out.println("Creating bank account.");
			case 3:
				System.out.println("Viewing customer details.");
			case 4:
				System.out.println("Depositing money.");
			case 5:
				System.out.println("Withdrawing money.");
			case 6:
				System.out.println("Checking account balance.");
			case 7:
				System.out.println("Transferring money.");
			case 8:
				System.out.println("Viewing transaction history.");
			case 9:
				System.out.println("Exiting");
				return;
			default:
				System.out.println("Invalid option.");
			}
		}
		
		
	}

}
