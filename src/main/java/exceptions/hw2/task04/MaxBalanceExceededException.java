package exceptions.hw2.task04;

public class MaxBalanceExceededException extends RuntimeException {

    public MaxBalanceExceededException(String message) {
        super(message);
    }
}