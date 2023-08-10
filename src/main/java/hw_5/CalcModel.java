package hw_5;

public class CalcModel {
    private int result;

    public int sum(int value1, int value2) {
        result = value1 + value2;
        return result;
    }

    public int sub(int value1, int value2) {
        result = value1 - value2;
        return result;
    }

    public int div(int value1, int value2) {
        if(value2 != 0) {
            result = value1/value2;
        } else {
            throw new IllegalArgumentException("Деление на ноль недопустимо.");
        }
        return result;
    }

    public int multiply(int value1, int value2) {
        return value1 * value2;
    }

    public int getResult() {
        return result;
    }
}
