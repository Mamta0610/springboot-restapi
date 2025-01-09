package rajkumar;

class Clothing extends Product {
    String size;
    String material;

    public Clothing(String name, double price, String size, String material) {
        super(name, price);
        this.size = size;
        this.material = material;
    }

    @Override
    public void displayInfo() {
        System.out.println("Clothing Name: " + name);
        System.out.println("Size: " + size + ", Material: " + material);
        System.out.println("Price: " + price);
    }
}
