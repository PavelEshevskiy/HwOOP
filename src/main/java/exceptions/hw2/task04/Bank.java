package exceptions.hw2.task04;

import java.util.Scanner;

public class Bank implements Runnable {

    private final Scanner scanner;
    BankAccount account;

    public Bank(double amount, Scanner scanner) {
        account = new BankAccount(amount);
        this.scanner = scanner;
    }

    public String registerAccount() {
        account = new BankAccount();
        return account.toString();
    }


    public double withdrawCash(double amount) {
        account.withdrawCash(amount);
        return account.getPersonalAccount();
    }

    public double depositCash(double amount) {
        account.depositCash(amount);
        return account.getPersonalAccount();
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму для снятия:");
        double amount = scanner.nextDouble();
        double newBalance = withdrawCash(amount);
        System.out.println("Остаток на счете: " + newBalance);
    }
}