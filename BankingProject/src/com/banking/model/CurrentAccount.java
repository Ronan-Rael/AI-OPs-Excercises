package com.banking.model;

import java.time.LocalDate;

public class CurrentAccount extends Account{
	
	CurrentAccount(int accountNumber, int customerId, double accountBalance, LocalDate dateCreated){
		super(accountNumber, customerId, AccountType.CURRENT, accountBalance, dateCreated);
	}
	
	@Override
	public String toString() {
		return "Current Account [accountNumber=" + accountNumber + ", customerID=" + customerID + ", accountType=" + accountType
				+ ", accountBalance=" + accountBalance + ", dateCreated=" + dateCreated + "]";
	}
	
	public static void main(String[] args) {
		
	}
}
