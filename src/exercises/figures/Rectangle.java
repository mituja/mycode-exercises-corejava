package exercises.figures;

public class Rectangle implements Figure {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return (2 * length + 2 * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
