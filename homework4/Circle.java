package homework4;

import java.util.Scanner;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    static double pi = Math.PI;

    @Override
    protected double area() {
        System.out.print("Area -> ");
        double r = inputRadius();
        double result = r * r * pi;
        if (result < 0) {
            throw new NumberFormatException(result + " --- area can't be a negative number");
        }
        return result;
    }

    @Override
    protected double perimeter() {
        System.out.print("Perimeter -> ");
        double r = inputRadius();
        double result = 2 * r * pi;
        if (result < 0) {
            throw new NumberFormatException(result + " --- perimeter can't be a negative number");
        }
        return result;
    }

    private double inputRadius() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Please input radius of the circle:");
        this.radius = reader.nextDouble();
        return this.radius;
    }

}
