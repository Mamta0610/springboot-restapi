package santhiPriya;

import java.util.Scanner;

public class DoWhileLoopExample {
	public static void main(String[] args) {
		double balance = 15000;
		int pin = 1234;
		int enteredPin;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your atm pin ");
		enteredPin = sc.nextInt();
		
		if(enteredPin !=pin) {
			System.out.println("Incorrect Pin, try again ");
			sc.close();
			return;
		}
		int option;
		do {
			System.out.println(" ATM Menu ");
			System.out.println("1. Check balance ");
			System.out.println("2. Deposit Money ");
			System.out.println("3. Withdraw Money ");
			System.out.println("4. Exit ");
			option = sc.nextInt();
			
			switch(option) {
			case 1 : 
				System.out.println("Your current balance : " + balance);
				break;
			case 2 : 
				System.out.println("ENter amount to deposit ");
				double deposit = sc.nextDouble();
				System.out.println("You have successfully deposit : " + deposit);
				balance+=deposit;
				break;
			case 3 :
				System.out.println("ENter amount to withdraw");
				double withdraw = sc.nextDouble();
				if(withdraw>balance) {
					System.out.println("Insufficient Funds");
				}else {
					balance-=withdraw;
					System.out.println("You have successfully withdrawn : " + withdraw);
				}break;
			case 4: 
				System.out.println("thank you ");
				break;
			default : //else
				System.out.println("Invalid option. please choose option (1-4)");
			}
		}while(option!=4); //continue loop until the user chooses to exit (option 4)
		
		
		sc.close();
	}

}
