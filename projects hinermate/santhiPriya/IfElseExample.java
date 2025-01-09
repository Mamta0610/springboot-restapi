package santhiPriya;

public class IfElseExample {
	public static void main(String[] args) {
		double balance = 10000; 
		double withdrawalAmt = 5000;
		
		if(withdrawalAmt <= balance) { 
			balance -= withdrawalAmt;
			System.out.println("Withdrawal Successful...");
			System.out.println("Updated balance : " + balance);
		}else {
			System.out.println("Insufficient Funds, withdrawal not possible ");
		}

	}

}
