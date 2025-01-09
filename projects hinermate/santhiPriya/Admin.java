package santhiPriya;

public class Admin extends User{

	public Admin(String username, String password) {
		super(username, password);
	}
	
	public void manageInventory() {
		System.out.println("Admin " + username + " is managing the inventory");
	}
	
	@Override
	public void login() {
		System.out.println("Admin " + username + " logged in & managing the inventory");
	}
}
