package exceptions.sem1.ex03;

public class ExampleThrowArithmeticException {
    public static void main(String[] args) {
        try {
            int numerator = 10;
            int denominator = 0;

            if (denominator == 0) {
                throw new ArithmeticException("Division by zero");
            }
            // ArithmeticException exception = new ArithmeticException("Division by zero");
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException exception) {
            System.out.println("ArithmeticException caught: " + exception.getMessage());
            System.out.println(exception);
            exception.printStackTrace();
        }
    }
}
