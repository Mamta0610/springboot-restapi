package rajkumar;

class Food extends Product {
    String expirationDate;

    public Food(String name, double price, String expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    @Override
    public void displayInfo() {
        System.out.println("Food Name: " + name);
        System.out.println("Price: " + price + ", Expiration Date: " + expirationDate);
    }
}
