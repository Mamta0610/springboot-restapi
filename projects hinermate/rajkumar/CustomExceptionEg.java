package rajkumar;

public class CustomExceptionEg {
	public static void main(String[] args) {
		BankAccount ac = new BankAccount("12345AE", 20000);
		
		try {
			ac.depoist(10000); //30000
			
			ac.withdraw(15000); //15000
			
			ac.depoist(10000); //25000
			
			ac.withdraw(27000); //throw an exception
			
		}catch(InSufficientFundsException e) {
			System.out.println(e.getMessage());
		}
		catch(InvalidtransactionException e) {
			System.out.println(e + " " + e.getMessage());
		}
			
		
	}

}
