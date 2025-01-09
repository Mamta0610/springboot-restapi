package deepshikha;

import java.util.Scanner;

public class CustomExceptionEg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ATM a = new ATM("123456789", "1234", 10000);
		
		while(true) {
			System.out.println("Enter pin");
			String pin = sc.nextLine();
			if(a.validatePin(pin)) {
				System.out.println(" pin verified ");
				break;
			}else {
				System.out.println(" Incorrect pin, try again ");
			}
		}
		
		while(true) {
			System.out.println(" ATM Menu ");
			System.out.println("1. Check Balance ");
			System.out.println("2. Deposit Money ");
			System.out.println("3. Withdraw Money ");
			System.out.println("4. Transaction History ");
			System.out.println("5. Exit ");
			
			System.out.println(" Choose option ");
			int option = sc.nextInt();
			
			try {
				switch(option) {
				case 1:
					System.out.println(" Current Balance " + a.checkBalance());
					break;
				case 2 :
					System.out.println("Enter amount to deposit ");
					double amt = sc.nextDouble();
					a.deposit(amt);
					break;
				case 3 :
					System.out.println("Enter amount to withdraw ");
					double amtt = sc.nextDouble();
					a.withdraw(amtt);
					break;
				case 4:
					System.out.println(" Transaction History ");
					for(String transaction : a.getTransactionHistory()) {
						System.out.println(transaction);
					}
					break;
				case 5 :
					System.out.println(" Exiting ");
				default :
					System.out.println("Invalid option ");
				}
			}catch(IllegalArgumentException | LowFundsException e) {
				System.out.println(e);
			}
		}

	}

}
