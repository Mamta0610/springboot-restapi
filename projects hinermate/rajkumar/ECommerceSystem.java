package rajkumar;

public class ECommerceSystem {
	
	public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product laptop = new Electronics("Laptop", 999.99, "Dell", 24);
        Product shirt = new Clothing("T-Shirt", 19.99, "L", "Cotton");
        Product apple = new Food("Apple", 0.99, "2024-12-31");

        cart.addProduct(laptop);
        cart.addProduct(shirt);
        cart.addProduct(apple);

        cart.viewCart();

        System.out.printf("Total Price: ", cart.calculateTotal());

        cart.removeProduct(shirt);
        cart.viewCart();

        System.out.printf("Total Price after removal: ", cart.calculateTotal());
    }
}
