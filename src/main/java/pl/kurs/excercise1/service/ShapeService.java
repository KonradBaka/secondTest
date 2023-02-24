package pl.kurs.excercise1.service;

import pl.kurs.excercise1.model.Shape;

public class ShapeService {

    private Shape[] shapes;

    public ShapeService() {

    }

    public static String getMaxCircumference(Shape[] shapes) {
        Shape maxCircumference = shapes[0];
        for (int i = 1; i < shapes.length; i++) {
            if (shapes[i].calculateTheCircumference() > maxCircumference.calculateTheCircumference()) {
                maxCircumference = shapes[i];
            }
        }
        return "Figura z największym obwodem: " + maxCircumference;

    }

    public static String getMaxArea(Shape[] shapes) {
        Shape maxArea = shapes[0];
        for (int i = 1; i < shapes.length; i++) {
            if (shapes[i].calculateTheArea() > maxArea.calculateTheArea()) {
                maxArea = shapes[i];
            }
        }
        return "Figura z największym polem: " + maxArea;
    }
}
