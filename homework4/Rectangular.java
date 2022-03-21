package homework4;

import java.util.ArrayList;
import java.util.Scanner;

public class Rectangular extends Shape {
    protected ArrayList<Double> userEntries;

    protected Rectangular(ArrayList<Double> userEntries) {
        this.userEntries = userEntries;
    }

    @Override
    public double area() {
        System.out.println("Calculate the area of a rectangular");
        inputRectangularSides();
        double areaOfARectangular = 1;
        for (double sideLength : this.userEntries) {
            areaOfARectangular *= sideLength;
        }
        clearArrayList();
        if (areaOfARectangular < 0) {
            throw new NumberFormatException(areaOfARectangular + " --- area of the rectangular can't be a negative number");
        }
        return areaOfARectangular;
    }

    @Override
    public double perimeter() {
        System.out.println("Calculate the perimeter of a rectangular");
        inputRectangularSides();
        double perimeterOfARectangular = 0;
        for (double sideLength : this.userEntries) {
            perimeterOfARectangular += sideLength;
        }
        clearArrayList();
        if (perimeterOfARectangular < 0) {
            throw new NumberFormatException(perimeterOfARectangular + " --- perimeter of the rectangular can't be a negative number");
        }
        return perimeterOfARectangular;
    }

    void inputRectangularSides() {
        Scanner reader = new Scanner(System.in);
        int k = 1;
        do {
            System.out.println("Please enter the length of rectangular side number " + k);
            this.userEntries.add(reader.nextDouble());
            k++;
        } while (k <= 2);
    }

    void clearArrayList() {
        this.userEntries.clear();
    }
}
