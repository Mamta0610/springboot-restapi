package santhiPriya;

public class BankAccount {
	
	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}



	void deposit(double amount) {
		if(amount>0) {
			balance +=amount;
		}
	}
	
	void withdraw(double amount) {
		if(amount >0 && amount<=balance) {
			balance -= amount;
		}
	}
}
