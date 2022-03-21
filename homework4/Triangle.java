package homework4;

import java.util.ArrayList;
import java.util.Scanner;

public class Triangle extends Shape {
    protected ArrayList<Double> userEntries;   //u zadatku se trazilo da user entries budu smjesteni u ArrayList - iz tog razloga koristena

    protected Triangle(ArrayList<Double> userEntries) {
        this.userEntries = userEntries;
    }

    @Override
    protected double area() {
        System.out.println("Calculate the area of a triangle");
        inputTriangleSideAndHeight();
        double areaOfATriangle = 0;
        for (int i = 0; i < this.userEntries.size(); i++) {
            areaOfATriangle = (this.userEntries.get(0) * this.userEntries.get(1)) / 2;
        }
        clearArrayList();     // za brisanje sadržaja ArrayList nakon ispisa povrsine, da bi se lista mogla ponovo koristiti i da bi bila prazna
        if (areaOfATriangle < 0) {
            throw new NumberFormatException(areaOfATriangle + " --- area of the circle can't be a negative number");
        }
        return areaOfATriangle;
    }

    @Override
    protected double perimeter() {
        System.out.println("Calculate the perimeter of a triangle");
        inputTriangleSides();
        double perimeterOfATriangle = 0;
        for (double sideLength : this.userEntries) {
            perimeterOfATriangle += sideLength;
        }
        clearArrayList();
        if (perimeterOfATriangle < 0) {
            throw new NumberFormatException(perimeterOfATriangle + " --- perimeter of the triangle can't be a negative number");
        }
        return perimeterOfATriangle;
    }

    void inputTriangleSides() {
        Scanner reader = new Scanner(System.in);
        int k = 1;
        do {
            System.out.println("Please enter the length of triangle side number " + k);
            this.userEntries.add(reader.nextDouble());
            k++;
        } while (k <= 3);
    }

    void inputTriangleSideAndHeight() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter the length of triangle side: ");
        this.userEntries.add(reader.nextDouble());
        System.out.println("Please enter the triangle height: ");
        this.userEntries.add(reader.nextDouble());
    }

    void clearArrayList() {
        this.userEntries.clear();
    }


}
