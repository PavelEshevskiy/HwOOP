package exceptions.sem2.ex02;

public class Calculator {
    public static int subtract(int a, int b) throws SubtractionException {
        if (a < b) {
            throw new SubtractionException("subtraction", a, b, "Negative result not allowed");
        }
        return a - b;
    }

    public static void main(String[] args) {
        try {
            int result1 = subtract(50, 20);
            System.out.println("Subtraction result: " + result1);

            int result2 = subtract(10, 30);
            System.out.println("Subtraction result: " + result2);
        } catch (SubtractionException e) {
            System.out.println("Subtraction Exception: " + e.getMessage());
        }
    }
}