package santhiPriya;

public class CreditCardProcessor extends PaymentProcessor{

	@Override
	void processPayment(double amount) {
		System.out.println("Processing credit card payment of $ "+amount);
	}

	@Override
	void refund(double amount) {
		System.out.println("Refunding credit card payment of $"+ amount);
	}

}
