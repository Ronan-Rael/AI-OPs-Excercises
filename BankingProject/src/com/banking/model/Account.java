package com.banking.model;

import java.time.LocalDate;

public abstract class Account {
	
	private int accountNumber;
	private int customerID;
	private String accountType;
	private double accountBalance;
	private LocalDate dateCreated;
	
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public int getCustomerId() {
		return customerID;
	}



	public void setCustomerId(int customerId) {
		this.customerID = customerId;
	}



	public String getAccountType() {
		return accountType;
	}



	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}



	public double getAccountBalance() {
		return accountBalance;
	}



	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}



	public LocalDate getDateCreated() {
		return dateCreated;
	}



	public void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	Account(int accountNumber, int customerId, String accountType, double accountBalance, LocalDate dateCreated){
		this.accountNumber = accountNumber;
		this.customerID = customerId;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
		this.dateCreated = dateCreated;
	}

	public static void main(String[] args) {

	}

}
