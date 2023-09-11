package exceptions.sem2.ex03;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        Product laptop = new Product("Ноутбук", 5);
        store.addProduct(laptop);

        Product retrievedLaptop = store.getProduct("Ноутбук");
        System.out.println("Найден товар: " + retrievedLaptop);

        store.sellProduct("Ноутбук", 3);
        store.sellProduct("Ноутбук", 3); // Это вызовет отсутствие товара

        Product phone = new Product("Смартфон", 10);
        store.addProduct(phone);

        store.sellProduct("Смартфон", 15); // Это вызовет недостаток товара
    }



}