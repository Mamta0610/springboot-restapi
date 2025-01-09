package rajkumar;

abstract class Product {
	
	  String name;
	    double price;

	    public Product(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }

	    public abstract void displayInfo();
	    
}
