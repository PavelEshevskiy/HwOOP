package SOLIDtoCalc;

/**
 * определяет только методы для выполнения математических операций;
 * является открытым для расширения, так как можно добавить новые методы
 * для выполнения других математических операций без изменения существующего кода;
 */
public interface ICalcModel {
    double add(double firstNumber, double secondNumber);
    double subtract(double firstNumber, double secondNumber);
    double multiply(double firstNumber, double secondNumber);
    double divide(double firstNumber, double secondNumber);
}
