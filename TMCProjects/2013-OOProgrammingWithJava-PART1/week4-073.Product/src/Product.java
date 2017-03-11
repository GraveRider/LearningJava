
public class Product {

    private double price;
    private int amount;
    private String name;

    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        name = nameAtStart;
        price = priceAtStart;
        amount = amountAtStart;
    }
    public void printProduct() {
        System.out.println(name + ", price " + price + ", amount " + amount);
    }
}
