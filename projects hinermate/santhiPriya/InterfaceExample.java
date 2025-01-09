package santhiPriya;

public class InterfaceExample implements ATM{

	public static void main(String[] args) {
		InterfaceExample ie = new InterfaceExample();
		int balance = 20000;
		ie.enterPin("123AB");
		ie.withDrawMoney(3000);
		ie.checkBalance();
		System.out.println(balance);

	}

	@Override
	public void enterPin(String pin) {
		System.out.println("Pin entered : " +pin);
	}

	@Override
	public void checkBalance() {
		System.out.println("checking balance : ");
		
	}

	@Override
	public void withDrawMoney(double amount) {
		System.out.println("Withdraw money : "+amount);
		
	}

}
