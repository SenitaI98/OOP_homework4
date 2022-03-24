package homework4;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Shape> shapeEntries = new ArrayList<>();
        char yOrN = ' ';

        do {
            int userOption = meniOption();
            switch (userOption) {
                case 1:
                    int numberOfCalculations = repetitionsNumber();
                    for (int i = 1; i < numberOfCalculations + 1; i++) {
                        System.out.println("Enter radius of the circle number " + i);
                        double radius = reader.nextDouble();
                        shapeEntries.add(new Circle(radius));
                    }
                    break;
                case 2:
                    numberOfCalculations = repetitionsNumber();
                    for (int i = 1; i < numberOfCalculations + 1; i++) {
                        System.out.println("Triangle " + i);
                        System.out.println("Enter the length of side a");
                        double sideA = reader.nextDouble();
                        System.out.println("Enter the length of side b");
                        double sideB = reader.nextDouble();
                        System.out.println("Enter the length of side c");
                        double sideC = reader.nextDouble();
                        shapeEntries.add(new Triangle(sideA, sideB, sideC));
                    }
                    break;
                case 3:
                    numberOfCalculations = repetitionsNumber();
                    for (int i = 1; i < numberOfCalculations + 1; i++) {
                        System.out.println("Rectangular number " + i);
                        System.out.println("Enter the length of side a");
                        double sideA = reader.nextDouble();
                        System.out.println("Enter the length of side b");
                        double sideB = reader.nextDouble();
                        shapeEntries.add(new Rectangular(sideA, sideB));
                    }
                    break;
                default:
                    System.out.println("You choose wrong action!");
            }
            System.out.println("Do you want another option from menu?");
            yOrN = reader.next().toLowerCase().charAt(0);
        } while (yOrN == 'y');
        result(shapeEntries);

    }

    public static int meniOption() {
        String[] menu = {"Perimeter and area calculator:", "1.Circle", "2.Triangle", "3.Rectangular"};
        for (String menuElements : menu) {
            System.out.println(menuElements);
        }
        int option = reader.nextInt();
        return option;
    }

    public static int repetitionsNumber() {
        System.out.println("How many times do you want to calculate area and perimeter?");
        int number = reader.nextInt();
        if (number < 0) {
            throw new NumberFormatException(" --- can't be a negative number");
        }
        return number;
    }

    public static void result(ArrayList<Shape> shapes) {
        System.out.println("===================================" + "\nRESULT");
        int k = 1;

        for (Shape element : shapes) {
            try {
                System.out.println("Input number " + k + " -> " + "Area: " + element.area() + " | Perimeter: " + element.perimeter());
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            k++;
        }
    }


}
