package hw_5;

import java.util.Scanner;

public class CalcView {
    Scanner scanner = new Scanner(System.in);
    public void displayResult(int result) {
        System.out.println("Результат: " + result);
    }

    public int getUserInput() {

        System.out.print("Введите число: ");
        int input = scanner.nextInt();
        return input;
    }

    public char getUserOperation(){
        System.out.println("Choose operation: (+, -, /, *) ");
        return  scanner.next().charAt(0);
    }
}
