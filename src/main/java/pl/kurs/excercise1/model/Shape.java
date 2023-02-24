package pl.kurs.excercise1.model;

import pl.kurs.excercise1.exceptions.NegativeValueException;

import java.io.Serializable;

public abstract class Shape implements Serializable {

    private static int numberOfFigure = 0;
    private int figureNumber;

    public Shape() {
        this.figureNumber = ++numberOfFigure;
    }

    public abstract double calculateTheCircumference();

    public abstract double calculateTheArea();


    public static Square createASquare(double a) {
        return Square.createSquare(a);
    }

    public static Circle createACircle(double r) {
        return Circle.createCircle(r);
    }

    public static Rectangle createARectangle(double a, double b) {
        return Rectangle.createRectangle(a, b);
    }

    public abstract String description();

    @Override
    public String toString() {
        return "Figura nr " + figureNumber + ": " + description();
    }
}
