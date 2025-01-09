package rajkumar;

@SuppressWarnings("serial")
public class InSufficientFundsException extends Exception {
	
	private double balance;
	private double amount;
	
	public InSufficientFundsException(double balance, double amount) {
		super("Insufficent funds : Current balance is :" + balance + " attempted withdrawal is : " + amount);
		this.balance = balance;
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public double getAmount() {
		return amount;
	}
	
}
