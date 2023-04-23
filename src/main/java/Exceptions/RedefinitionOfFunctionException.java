package Exceptions;

public class RedefinitionOfFunctionException extends RuntimeException{
    public RedefinitionOfFunctionException(String message) {
        super(message);
    }
}
