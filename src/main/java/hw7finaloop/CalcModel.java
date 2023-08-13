package hw7finaloop;

import java.util.logging.Logger;

public class CalcModel implements ICalcModel {

    private static final Logger logger = Logger.getLogger(CalcModel.class.getName());

    @Override
    public double add(double firstNumber, double secondNumber) {
        double result = firstNumber + secondNumber;
//        logger.info("Addition: {} + {} = {}", firstNumber, secondNumber, result);
        return result;

    }

    @Override
    public double subtract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    @Override
    public double divide(double firstNumber, double secondNumber) {
//        return firstNumber / secondNumber;
        if(secondNumber != 0) {
            return firstNumber / secondNumber;
        } else {
            throw new IllegalArgumentException("Деление на ноль недопустимо.");
        }
    }
}
