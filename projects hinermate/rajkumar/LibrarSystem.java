package rajkumar;

public class LibrarSystem {

	public static void main(String[] args) {
		Books bk = new Books("Java Fundamental", "ABC Company", 2020, "James");
		bk.displayInfo();
		bk.borrow();
		bk.returnItem();
		
		Magazine ma = new Magazine("Hollywood News", "XYZ Co", 2024,1234);
		ma.displayInfo();
		ma.borrow();
		ma.returnItem();
		
		DVD d = new DVD("Harry Potter", "John", 2021, "John Sam");
		d.displayInfo();
		d.borrow();
		d.returnItem();

	}

}
