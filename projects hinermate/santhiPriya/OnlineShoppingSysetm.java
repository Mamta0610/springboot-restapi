package santhiPriya;

public class OnlineShoppingSysetm {
	public static void main(String[] args) {
		//product object
		Product p1 = new Product(1, "Laptop", 75000, 10);
		Product p2 = new Product(2, "SmartPhone", 55000, 20);
		Product p3 = new Product(3, "Bag", 5000, 50);
		
		System.out.println(p1.getProductDetails());
		System.out.println(p2.getProductDetails());
		System.out.println(p3.getProductDetails());
		
		//User object - Customer & Admin
		Customer c = new Customer("mamtaB", "pass123", "mumbai", 9876543);
		Admin a = new Admin("admin1", "password123");
		
		c.login();  //invoke parent method
		c.placeOrder();  //invoke child method
		
		a.login(); //invoke parent method
		a.manageInventory();  //invoke child method
		
		//PaymentMethod object
		PaymentMethod pm = new CreditCardPayment(100000, "123-456-789");
		
		pm.processPayment(); //invoke method
	}

}
