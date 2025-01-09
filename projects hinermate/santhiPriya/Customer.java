package santhiPriya;
//derived class
public class Customer extends User{
	private String address;
	private long phone;

	public Customer(String username, String password, String address, long phone) {
		super(username, password);
		this.address=address;
		this.phone=phone;	
	}

	public void placeOrder() {
		System.out.println(username + " placed an order, will be deliver at below address " + address);
		System.out.println("Customer contact number : " + phone);
	}
	
	@Override
	public void login() {
		System.out.println("Customer " + username + " logged in & browsing product");
	}
}
