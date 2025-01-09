package santhiPriya;

public class EncapsulationExample {

	public static void main(String[] args) {
		BankAccount b = new BankAccount(20000);
		System.out.println("Avaliable balance : " + b.getBalance());
		b.deposit(5000);
		System.out.println("Current balance After deposit : " + b.getBalance());
		b.withdraw(2000);
		System.out.println("Current balance After withdraw: " + b.getBalance());

	}

}
