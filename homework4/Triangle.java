package homework4;


public class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    protected double area() {
        double areaOfATriangle = (this.sideA + this.sideB + this.sideC) / 2;
        if (areaOfATriangle < 0) {
            throw new NumberFormatException(areaOfATriangle + " --- area of the triangle can't be a negative number");
        }
        return areaOfATriangle;
    }

    @Override
    protected double perimeter() {
        double perimeterOfATriangle = this.sideA + this.sideB + this.sideC;
        if (perimeterOfATriangle < 0) {
            throw new NumberFormatException(perimeterOfATriangle + " --- perimeter of the triangle can't be a negative number");
        }
        return perimeterOfATriangle;
    }
}
