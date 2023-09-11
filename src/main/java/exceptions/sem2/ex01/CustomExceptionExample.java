package exceptions.sem2.ex01;

public class CustomExceptionExample {

    public static void main(String[] args) {
        try {
            int result = divideNumbers(10, 0);
            System.out.println("Result: " + result);
        } catch (DivisionByZeroException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
//    DivisionByZeroException ex = new DivisionByZeroException("Division by zero is not allowed");

    public static int divideNumbers(int dividend, int divisor)  {
        if (divisor == 0) {
            throw new DivisionByZeroException("Division by zero is not allowed");
        }
        return dividend / divisor;
    }
}