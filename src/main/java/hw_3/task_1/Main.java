package hw_3.task_1;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        market.addCustomer("John");
        market.addCustomer("Alice");
        market.addCustomer("Bob");

        for (String customer : market) {
            System.out.println("Customer: " + customer);
        }

        // Output:
        // Customer: John
        // Customer: Alice
        // Customer: Bob
    }
}
