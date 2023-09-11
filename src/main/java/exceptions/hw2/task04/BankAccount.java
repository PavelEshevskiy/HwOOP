package exceptions.hw2.task04;

public class BankAccount {

    private double personalAccount;

    public BankAccount() {
        personalAccount = 0;
    }

    public BankAccount(double personalAccount) {
        this.personalAccount = personalAccount;
    }

    public double getPersonalAccount() {
        return personalAccount;
    }

    public void withdrawCash(double amount) throws InsufficientFundsException {
        if (amount <= 0 || amount > personalAccount) {
            throw new InsufficientFundsException("Средств на вашем счете недостаточно");
        }
        personalAccount -= amount;
    }

    public void depositCash(double amount) throws MaxBalanceExceededException {
        int maxBalance = 100000;
        if (personalAccount == maxBalance | amount + personalAccount > maxBalance)
            throw new InsufficientFundsException("Переполнение счета");
        personalAccount += amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "personalAccount=" + personalAccount +
                '}';
    }
}