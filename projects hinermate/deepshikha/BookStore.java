package deepshikha;

public class BookStore {
	
	double calcPrice(double price) { 
		return price;
	}
	
	double calcPrice(double price, int quantity) { 
		return price * quantity;
	}
	
	double calcPrice(double price, int quantity, double discount) {
		double total = price * quantity;
		return total - (total*discount/100);
	}
}
