package rajkumar;

public class BankAccount {
	
	@SuppressWarnings("unused")
	private String accountNumber;
	
	private double balance;

	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void depoist(double amount) throws InvalidtransactionException{
		if(amount <=0) {
			throw new InvalidtransactionException("Amount to deposit should be in positive number");
		}balance +=amount;
		System.out.println("Deposit Successfully : New Balance is " + balance );
	}
	
	public void withdraw(double amount) throws InSufficientFundsException, InvalidtransactionException{
		if(amount <=0) {
			throw new InvalidtransactionException("Amount to withdraw should be in positive number");
		}
		if(amount > balance) {
			throw new InSufficientFundsException(balance, amount);
		}
		balance -=amount;
		System.out.println("Withdrawal successfully : New balance is " + balance);
	}
}
