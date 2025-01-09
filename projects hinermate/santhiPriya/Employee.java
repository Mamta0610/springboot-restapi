package santhiPriya;

public class Employee {
	String name;
	String surname; 
	long phone;
	String email;
	
	public Employee(String name, String surname, long phone, String email) {
		this.name = name;
		this.surname = surname;
		this.phone = phone;
		this.email = email;
	}
	
	public void displayInfo() {
		System.out.println("Employee Details ");
		System.out.println(name + " "+surname+" "+phone+" "+email);
	}
	
	

}
