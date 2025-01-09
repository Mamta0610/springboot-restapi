package deepshikha;

public class EncapsulationEg {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount("123456A", "Mamta", 20000);
		
		ba.withdraw(5000);
		
		ba.deposit(10000);
		
		ba.withdraw(27000);
		
		System.out.println(ba.getBalance());

	}

}
//encapsulation - restricts direct access to some of object components, can be 
// achieved by using private variables & public getter setter
// benefit : data hiding, control, maintainability