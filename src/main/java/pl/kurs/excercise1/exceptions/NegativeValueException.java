package pl.kurs.excercise1.exceptions;

public class NegativeValueException extends  RuntimeException{

    public NegativeValueException(String message) {
        super(message);
    }
}
