package deepshikha;

import java.util.ArrayList;

public class ATM {
	
	private String accountNumber;
	private String pin;
	private double balance;
	
	private ArrayList<String> transactionHistory;
	
	public ATM(String accountNumber, String pin, double balance) {
		this.accountNumber = accountNumber;
		this.pin = pin;
		this.balance = balance;
		this.transactionHistory = new ArrayList<String>();
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	
	public boolean validatePin(String pin) {
		return pin.equals(pin);
	}
	
	public double checkBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if(amount<=0) {
			throw new IllegalArgumentException(" Deposit amount must be positve number");
		}
		balance+=amount;
		transactionHistory.add("Successfully Deposited " + amount);
	}
	
	public void withdraw(double amount) throws LowFundsException{
		if(amount<=0) {
			throw new IllegalArgumentException(" Deposit amount must be positve number");
		}
		if(amount>balance) {
			throw new LowFundsException("Insufficient Funds in your account ");
		}
		balance-=amount;
		transactionHistory.add(" Successfully fund withdrawal " + amount);
	}
	
	public ArrayList<String> getTransactionHistory(){
		return transactionHistory;
	}
}
