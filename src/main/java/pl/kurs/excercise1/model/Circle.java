package pl.kurs.excercise1.model;

import pl.kurs.excercise1.exceptions.NegativeValueException;

import java.io.Serializable;
import java.util.Objects;

public class Circle extends Shape implements Serializable {

    private double r;

    public Circle() {

    }

    private Circle(double r) {
        this.r = r;
    }

    public static Circle createCircle(double a) {
        if (a <= 0) {
            throw new NegativeValueException("Nie można stwożyć kwadratu o ujemnym boku!");
        }
        return new Circle(a);
    }

    @Override
    public double calculateTheCircumference() {
        return 2 * Math.PI * r;
    }

    @Override
    public double calculateTheArea() {
        return Math.PI * r * r;
    }

    @Override
    public String description() {
        return "Koło o promieniu " + r;
    }

    public double getR() {
        return r;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.r, r) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r);
    }
}
