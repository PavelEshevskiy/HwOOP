package exceptions.hw2.task03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое значение: ");
        double first = scanner.nextDouble();
        System.out.print("Введите второе значение: ");
        double second = scanner.nextDouble();
        System.out.print("Введите третье значение: ");
        double third = scanner.nextDouble();
        try {
            System.out.println(threeValues(first, second, third));
            scanner.close();
        } catch (NumberOutOfRangeException | NumberSumException | NotSupportedArgumentException e) {
            System.out.println(e.getMessage());
            scanner.close();
        }
    }

    private static String threeValues(double x, double y, double z) throws NotSupportedArgumentException,
            NumberOutOfRangeException, NumberSumException {
        if (x > 100) throw new NumberOutOfRangeException("x must be more than 100");
        if (y < 0) throw new NumberOutOfRangeException("y must be more than 0");
        if (x + y < 10) throw new NumberSumException("x + y must be greater than 10");
        if (z == 0) throw new NotSupportedArgumentException("z must be greater than 0");
        return "All values are valid.";
    }
}