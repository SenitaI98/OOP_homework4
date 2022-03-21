package homework4;

import java.util.ArrayList;
import java.util.Scanner;

public class Rectangular extends Shape {
    private double sideA;
    private double sideB;

    protected Rectangular(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
        double areaOfARectangular = sideA * sideB;
        if (areaOfARectangular < 0) {
            throw new NumberFormatException(areaOfARectangular + " --- area of the rectangular can't be a negative number");
        }
        return areaOfARectangular;
    }

    @Override
    public double perimeter() {
        double perimeterOfARectangular = 2 * (sideA + sideB);
        if (perimeterOfARectangular < 0) {
            throw new NumberFormatException(perimeterOfARectangular + " --- perimeter of the rectangular can't be a negative number");
        }
        return perimeterOfARectangular;
    }
}
