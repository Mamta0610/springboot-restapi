package deepshikha;

public class BankAccount {	
	private String accountNumber;
	private String accountName;
	private double balance;
	
	
	public BankAccount(String accountNumber, String accountName, double balance) {		
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public void deposit(double amount) {
		if(amount >0) {
			balance +=amount;
			System.out.println("Updated Balance : " + balance);
		}else {
			System.out.println("Deposit amount must be positive");
		}
	}
	
	public void withdraw(double amount) {
		if(amount >0 && amount <=balance) {
			balance -=amount;
			
			System.out.println(" Amount Withdrawn " + balance);
		}else {
			System.out.println(" withdrawal amount is more than balance ");
		}
	}

}
