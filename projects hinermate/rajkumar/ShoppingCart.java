package rajkumar;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    List<Product> products;

    public ShoppingCart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.name + " added to the cart.");
    }

    public void removeProduct(Product product) {
        products.remove(product);
        System.out.println(product.name + " removed from the cart.");
    }

    public void viewCart() {
        System.out.println("Shopping Cart Contents:");
        for (Product product : products) {
            product.displayInfo();
            System.out.println();
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.price;
        }
        return total;
    }
}

