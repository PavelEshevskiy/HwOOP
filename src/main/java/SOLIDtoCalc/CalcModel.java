package SOLIDtoCalc;

/**
 * реализует интерфейс ICalcModel и содержит только логику выполнения математических операций;
 * закрыт для изменений, так как он реализует все методы интерфейса ICalcModel и
 * не нуждается в изменении при добавлении новых операций;
 * является подклассом интерфейса ICalcModel, и поэтому может быть использован везде,
 * где ожидается экземпляр интерфейса ICalcModel;
 */
public class CalcModel implements ICalcModel {
    @Override
    public double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
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
