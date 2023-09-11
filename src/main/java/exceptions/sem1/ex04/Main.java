package exceptions.sem1.ex04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(div(scanner.nextDouble(), scanner.nextDouble()));

    }

    public static double div(double x, double y) {
        double result = 0;
        while (true) {
            try {
                result = x / y;
                break;
            } catch (InputMismatchException exception) {
                System.out.println("Деление на ноль недопустимо");
            }
        }
        return result;
    }
}
