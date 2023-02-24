package pl.kurs.excercise1.app;

import pl.kurs.excercise1.exceptions.NegativeValueException;
import pl.kurs.excercise1.model.Shape;
import pl.kurs.excercise1.service.ShapeService;

public class ShapesRunner {
    public static void main(String[] args) {

        Shape[] shapes = {Shape.createASquare(10), Shape.createACircle(20), Shape.createARectangle(10, 20),
                Shape.createASquare(15)};
        for (Shape f : shapes) {
            System.out.println(f);
        }

        System.out.println();
        System.out.println(ShapeService.getMaxCircumference(shapes));
        System.out.println(ShapeService.getMaxArea(shapes));
        System.out.println();

        for (Shape f : shapes) {
            if (f.equals(Shape.createARectangle(10, 20))) {
                System.out.println("tu powinno wejsc");
            }
        }
    }
}
