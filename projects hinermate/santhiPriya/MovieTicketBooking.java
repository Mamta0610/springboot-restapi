package santhiPriya;

public class MovieTicketBooking {
	
	 void bookTicket(int age) throws AgeRestrictionException{
		if(age<21) {
			throw new AgeRestrictionException("You cannot proceed to book ticket as you are under age");
		}else {
			System.out.println("Kindly proceed with booking ticket & enjoy movie");
		}
	}
	public static void main(String[] args) {
	MovieTicketBooking b = new MovieTicketBooking();
	
	try {
		b.bookTicket(25);
	} catch (AgeRestrictionException e) {
		System.out.println(e);
	}

	}

}
