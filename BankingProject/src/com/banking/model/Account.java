package com.banking.model;

import java.time.LocalDate;

public abstract class Account {
	
	protected int accountNumber;
	protected int customerID;
	protected AccountType accountType;
	protected double accountBalance;
	protected LocalDate dateCreated;
	
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public int getCustomerId() {
		return customerID;
	}



	public void setCustomerId(int customerId) {
		this.customerID = customerId;
	}



	public AccountType getAccountType() {
		return accountType;
	}



	public void setAccountType(AccountType accountType) {
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
	
	Account(int accountNumber, int customerID, AccountType accountType, double accountBalance, LocalDate dateCreated){
		this.accountNumber = accountNumber;
		this.customerID = customerID;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
		this.dateCreated = dateCreated;
	}
	
	

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", customerID=" + customerID + ", accountType=" + accountType
				+ ", accountBalance=" + accountBalance + ", dateCreated=" + dateCreated + "]";
	}

	public static void main(String[] args) {

	}

}
