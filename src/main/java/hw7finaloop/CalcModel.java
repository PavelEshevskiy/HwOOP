package hw7finaloop;


public class CalcModel implements ICalcModel {

    private Logger logger;

    public CalcModel() {
        logger = new Logger();
    }

    @Override
    public double add(double firstNumber, double secondNumber) {
        double result = firstNumber + secondNumber;
        logger.info("Addition: %s + %s = %s".formatted(firstNumber, secondNumber, result));
        return result;

    }

    @Override
    public double subtract(double firstNumber, double secondNumber) {
        double result = firstNumber - secondNumber;
        logger.info("Subtraction: %s - %s = %s".formatted(firstNumber, secondNumber, result));
        return result;
    }

    @Override
    public double multiply(double firstNumber, double secondNumber) {
        double result = firstNumber * secondNumber;
        logger.info("Multiplication: %s * %s = %s".formatted(firstNumber, secondNumber, result));
        return result;
    }

    @Override
    public double divide(double firstNumber, double secondNumber) {
//        return firstNumber / secondNumber;
        if(secondNumber != 0) {
            double result = firstNumber / secondNumber;
            logger.info("Division: %s / %s = %s".formatted(firstNumber, secondNumber, result));
            return result;
        } else {
            logger.info("Деление на ноль недопустимо.");
            throw new IllegalArgumentException("Деление на ноль недопустимо.");
        }
    }
}
