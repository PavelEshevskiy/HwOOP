package exceptions.sem1.ex04;

import java.util.Scanner;

public class SimpleDivisionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean validInput = false;
        int dividend = 0;
        int divisor = 0;

        while (!validInput) {
            try {
                System.out.print("Enter the dividend: ");
                dividend = scanner.nextInt();

                System.out.print("Enter the divisor: ");
                divisor = scanner.nextInt();

                double result = (double) dividend / divisor;
                System.out.println("Result: " + result);

                validInput = true;  // Введены корректные числа, выходим из цикла
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: деление на ноль недопустимо.");
                scanner.nextLine();  // Очистка буфера ввода
            } catch (java.util.InputMismatchException e) {
                System.out.println("Ошибка: введите числа.");
                scanner.nextLine();  // Очистка буфера ввода
            }
        }

        scanner.close();
    }
}