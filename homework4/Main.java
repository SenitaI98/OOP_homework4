package homework4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle(1);
        Triangle myTriangle = new Triangle(new ArrayList<>());
        Rectangular myRectangular = new Rectangular(new ArrayList<>());
        //Menu
        Scanner reader = new Scanner(System.in);
        char yOrN;
        double area;
        double perimeter;
        do {
            String[] menu = {"Perimeter and area calculator:", "1.Circle", "2.Triangle", "3.Rectangular"};
            for (String menuElements : menu) {
                System.out.println(menuElements);
            }
            int option = reader.nextInt();
            try {
                switch (option) {
                    case 1:
                        area = myCircle.area();
                        System.out.println("Area of a circle is: " + area);
                        perimeter = myCircle.perimeter();
                        System.out.println("Perimeter of a circle is: " + perimeter);
                        break;
                    case 2:
                        area = myTriangle.area();
                        System.out.println("Area of a triangle is: " + area);
                        perimeter = myTriangle.perimeter();
                        System.out.println("Perimeter of a triangle is: " + perimeter);
                        break;
                    case 3:
                        area = myRectangular.area();
                        System.out.println("Area of a rectangular is: " + area);
                        perimeter = myRectangular.perimeter();
                        System.out.println("Perimeter of a rectangular is: " + perimeter);
                        break;
                    default:
                        System.out.println("You choose wrong action");

                }
            } catch (NumberFormatException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println("Do you want another option?");
            yOrN = reader.next().charAt(0);
        } while (yOrN == 'y' || yOrN == 'Y');

    }
}
