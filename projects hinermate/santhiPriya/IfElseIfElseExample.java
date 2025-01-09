package santhiPriya;
import java.util.Scanner;

public class IfElseIfElseExample {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); //scanner output for user input
	
	System.out.println("Enter your score ");
	int score = sc.nextInt(); //store values of user input in score variable
	
	if(score<=90 && score>80) {
		System.out.println("A Grade ");
	}else if(score <=80 && score>70) {
		System.out.println("B Grade ");
	}else if (score<=70 && score>60) {
		System.out.println("C Grade ");
	}else if(score <=60 && score>45) {
		System.out.println("D Grade ");
	}else if(score<=45 && score>=30) {
		System.out.println(" E Grade ");
	}
	else {
		System.out.println(" Failed ");
	}
	
	sc.close();
}
}
