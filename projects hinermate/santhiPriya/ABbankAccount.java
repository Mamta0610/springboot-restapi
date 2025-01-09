package santhiPriya;

public class ABbankAccount {
	private double balance;

	public ABbankAccount(double balance) {
		super();
		this.balance = balance;
	}

	public void withdraw(double amount) throws InsufficientBalanceException{
		if(amount>balance) {
			throw new InsufficientBalanceException("Insufficient Funds in our account, cannot proceed as balance is : " + balance);
		}else {
		balance -= amount;
		System.out.println("Withdrawal Successful... ");
		System.out.println("Remaining Balance : "+balance);
	   }
	}
	public void deposit(double amount) {
		balance += amount;
		System.out.println(" Deposit Successfully " + balance);
	}

	public static void main(String[] args) {
		ABbankAccount ab = new ABbankAccount(10000);
		
		ab.deposit(5000);
		
		try {
			ab.withdraw(17000);
		} catch (InsufficientBalanceException e) {
			System.out.println(e);
		}
	}

}
