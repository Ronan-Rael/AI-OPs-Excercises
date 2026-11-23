package com.banking.model;

import java.time.LocalDate;

public class SavingsAccount extends Account{
	
	SavingsAccount(int accountNumber, int customerId, double accountBalance, LocalDate dateCreated){
		super(accountNumber, customerId, "SAVINGS", accountBalance, dateCreated);
	}

	public static void main(String[] args) {
		
	}

}
