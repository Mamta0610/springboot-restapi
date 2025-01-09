package deepshikha;

public class OverloadingEg {
	public static void main(String[] args) {
		BookStore bs = new BookStore();
		
	System.out.println("Book Price " + bs.calcPrice(78.7));
	System.out.println("Book Price for 2books  " +	bs.calcPrice(50, 2));
	System.out.println("Book Price for 10% discount  " +	bs.calcPrice(89, 4, 10));

	}

}
//overloading - same method name but different data type or different no of parameters
