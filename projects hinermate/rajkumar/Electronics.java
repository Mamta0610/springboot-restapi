package rajkumar;

class Electronics extends Product {
    String brand;
    int warranty; 

    public Electronics(String name, double price, String brand, int warranty) {
        super(name, price);
        this.brand = brand;
        this.warranty = warranty;
    }

    @Override
    public void displayInfo() {
        System.out.println("Electronics Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price + ", Warranty: " + warranty + " months");
    }
}
