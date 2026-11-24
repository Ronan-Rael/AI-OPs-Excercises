package com.banking.model;

import java.time.LocalDate;

public class SavingsAccount extends Account{
	
	private double interestRate;
	private static final double minimumBalance = 100.0;
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	SavingsAccount(int accountNumber, int customerId, double accountBalance, LocalDate dateCreated, double interestRate){
		super(accountNumber, customerId, AccountType.SAVINGS, accountBalance, dateCreated);
		this.interestRate = interestRate;
	}
	
	@Override
	public String toString() {
		return "Savings Account [accountNumber=" + accountNumber + ", customerID=" + customerID + ", accountType=" + accountType
				+ ", accountBalance=" + accountBalance + ", dateCreated=" + dateCreated + ", interestRate = " + interestRate + "]";
	}

	public static void main(String[] args) {
		Account sa = new SavingsAccount(101, 100, 200, LocalDate.now(), 2);
		System.out.println(sa);
	}

}
