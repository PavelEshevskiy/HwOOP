package exceptions.hw2.task04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начальный баланс: ");
        double initialBalance = scanner.nextDouble();

        // Создаем экземпляр Bank с начальным балансом и передаем scanner
        Bank bank = new Bank(initialBalance, scanner);

        // Запускаем поток
        Thread bankThread = new Thread(bank);
        bankThread.start();
        Thread bankThread2 = new Thread(bank);
        bankThread2.start();

    }
}