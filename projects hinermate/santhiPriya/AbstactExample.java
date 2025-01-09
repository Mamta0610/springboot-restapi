package santhiPriya;

public class AbstactExample {
	public static void main(String[] args) {
		PayPalProcessor pp = new PayPalProcessor();
		pp.processPayment(20000);
		pp.refund(5000);
		
		CreditCardProcessor cc = new CreditCardProcessor();
		cc.processPayment(25000);
		cc.refund(5000);
	}

}
