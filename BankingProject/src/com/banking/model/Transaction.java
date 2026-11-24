package com.banking.model;
import java.time.LocalDate;

public class Transaction {
	
	private int transactionID;
	private int accountNumber;
	private TransactionType transactionType;
	private double amount;
	// Records the two participants in the transaction.
	private String transactionRef;
	private LocalDate transactionDate;
	
	public int getTransactionId() {
		return transactionID;
	}

	public int getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}



	public TransactionType getTransactionType() {
		return transactionType;
	}



	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}



	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}



	public String getTransactionRef() {
		return transactionRef;
	}



	public void setTransactionRef(String transactionRef) {
		this.transactionRef = transactionRef;
	}



	public LocalDate getTransactionDate() {
		return transactionDate;
	}



	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}
	
	Transaction(int transactionID, int accountNumber, TransactionType transactionType, double amount, String transactionRef, LocalDate transactionDate){
		this.transactionID = transactionID;
		this.accountNumber = accountNumber;
		this.transactionType = transactionType;
		this.amount = amount;
		this.transactionRef = transactionRef;
		this.transactionDate = transactionDate;
	}

	public static void main(String[] args) {

	}

}
