package santhiPriya;

//child class implement all abstract method of PaymentMethod class
public class CreditCardPayment extends PaymentMethod{
	
	private String cardNumber;

	public CreditCardPayment(double amount, String cardNumber) {
		super(amount);
		this.cardNumber = cardNumber;
	}

	@Override
	public void processPayment() {
		System.out.println("Processing credit card payment of " + amount+ " using card " + cardNumber);
		
		
	}

}
