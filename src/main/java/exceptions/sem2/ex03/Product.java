package exceptions.sem2.ex03;

public class Product {
    private String name;
    private int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    // Геттеры и сеттеры


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) throws OutOfStockException {
        this.quantity = quantity;
        if (this.quantity <= 0) {
            throw new OutOfStockException("Product");
        }
    }

    @Override
    public String toString() {
        return name + " - " + quantity + " шт.";
    }
}