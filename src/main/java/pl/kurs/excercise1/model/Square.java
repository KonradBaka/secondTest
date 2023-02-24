package pl.kurs.excercise1.model;

import pl.kurs.excercise1.exceptions.NegativeValueException;

import java.io.Serializable;
import java.util.Objects;

public class Square extends Shape implements Serializable {

    private double a;

    public Square() {

    }

    private Square(double a) {
        this.a = a;
    }

    public static Square createSquare(double a) {
        if (a <= 0) {
            throw new NegativeValueException("Nie można stwożyć kwadratu o ujemnym boku!");
        }
        return new Square(a);
    }

    @Override
    public double calculateTheCircumference() {
        return 4 * a;
    }

    @Override
    public double calculateTheArea() {
        return a * a;
    }

    public double getA() {
        return a;
    }

    @Override
    public String description() {
        return "Kwadrat o boku " + a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.a, a) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}
