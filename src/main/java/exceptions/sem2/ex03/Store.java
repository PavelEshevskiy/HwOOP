package exceptions.sem2.ex03;

import java.util.HashMap;
import java.util.Map;

class Store {
    private Map<String, Product> inventory;

    public Store() {
        inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        inventory.put(product.getName(), product);
    }

    public Product getProduct(String name) {
        return inventory.get(name);
    }

    public void sellProduct(String name, int quantity) {
        Product product = getProduct(name);
        try {
            product.setQuantity(product.getQuantity() - quantity);
            System.out.println("Товар '" + product.getName() + "' продан в количестве " + quantity + " шт.");
        } catch (OutOfStockException e) {
            System.out.println("Товар '" + name + "' отсутствует на складе или недостаточно в наличии.");
        }

    }
}