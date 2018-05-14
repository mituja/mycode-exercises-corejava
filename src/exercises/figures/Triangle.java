package exercises.figures;

public class Triangle implements Figure {

    private double firstSide;
    private double secondSide;
    private double thirdSide;
    private double height;


    public Triangle(double firstSide, double secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = Math.sqrt((firstSide * firstSide) + (secondSide * secondSide));
        this.height = Math.pow(firstSide, 2) - Math.pow(thirdSide/2, 2);

    }

    @Override
    public double getPerimeter() {
        return firstSide + secondSide + thirdSide;
    }

    @Override
    public double getArea() {
        return 0.5 * thirdSide * height;
    }
}
