package exceptions.hw3.exceptions;

import java.io.IOException;

public class WrongNameException extends IOException {

    public WrongNameException(String message) {
        super(message);
    }
}