package pl.kurs.excercise1.model;

import pl.kurs.excercise1.exceptions.NegativeValueException;

import java.io.Serializable;
import java.util.Objects;

public class Rectangle extends Shape implements Serializable {

    private double a;
    private double b;

    private Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public static Rectangle createRectangle(double a, double b) {
        if (a <= 0) {
            throw new NegativeValueException("Nie można stwożyć kwadratu o ujemnym boku!");
        }
        return new Rectangle(a, b);
    }

    @Override
    public double calculateTheCircumference() {
        return 2 * a + 2 * b;
    }

    @Override
    public double calculateTheArea() {
        return a * b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    @Override
    public String description() {
        return "Prostokąt o bokach " + a + "x" + b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.a, a) == 0 && Double.compare(rectangle.b, b) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
