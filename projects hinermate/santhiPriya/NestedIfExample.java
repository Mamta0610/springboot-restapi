package santhiPriya;

import java.util.Scanner;
public class NestedIfExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //scanner output for user input
		
		System.out.println("Enter your score ");
		int score = sc.nextInt(); //store values of user input in score variable
	//grading system works for score betn 0-99	
		if(score>=0 && score<=99) { //outer if
			if(score<=99 && score >90) { //inner if 
				System.out.println(" A+ Grade ");
			}
			else if(score<=90 && score>80) {
				System.out.println("A Grade ");
			}
			else if(score <=80 && score>70) {
				System.out.println("B Grade ");
			}
			else if (score<=70 && score>60) {
				System.out.println("C Grade ");
			}
			else if(score <=60 && score>45) {
				System.out.println("D Grade ");
			}
			else if(score<=45 && score>30) {
				System.out.println(" E Grade ");
			}
			else if(score<=30 && score>1){
				System.out.println(" Failed ");
			}
			else{ //inner else
				System.out.println("You are absent for exam ");
			}
		}//outer if end
		else { //outer else
			System.out.println(" Invalid score ");
		}
		sc.close();
	}

}
