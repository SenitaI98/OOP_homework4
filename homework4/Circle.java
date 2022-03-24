package homework4;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    static double pi = Math.PI;

    @Override
    protected double area() {
        double result = this.radius * this.radius * pi;
        if (result < 0) {
            throw new NumberFormatException(result + " --- area of the circle can't be a negative number");
        }
        return result;
    }

    @Override
    protected double perimeter() {
        double result = 2 * this.radius * pi;
        if (result < 0) {
            throw new NumberFormatException(result + " --- perimeter of the circle can't be a negative number");
        }
        return result;
    }

}
