package exceptions.hw2.task01;

public class InvalidNumberException extends IllegalArgumentException {

    public InvalidNumberException(String s) {
        super(s);
    }
}