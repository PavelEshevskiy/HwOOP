package SOLIDtoCalc;

import java.util.Scanner;

public class CalcView implements ICalcView {
    private Scanner scanner;

    public CalcView() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void showResult(double result) {
        System.out.println("Результат: " + result);
    }

    @Override
    public double getFirstNumber() {
        System.out.print("Введите первое число: ");
        return scanner.nextDouble();
    }

    @Override
    public double getSecondNumber() {
        System.out.print("Введите второе число: ");
        return scanner.nextDouble();
    }

    @Override
    public String getOperation() {
        System.out.print("Введите операцию (+, -, *, /): ");
        return scanner.next();
    }
}
