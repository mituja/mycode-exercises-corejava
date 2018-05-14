package exercises.figures;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type rectangle first side");
        double recFirstSide = scanner.nextDouble();
        System.out.println("Type rectangle second side");
        double recSecondSide = scanner.nextDouble();
        Figure rectangle = new Rectangle(recFirstSide, recSecondSide);

        System.out.println("Type circle radius");
        double radius = scanner.nextDouble();
        Figure circle = new Circle(radius);

        System.out.println("Type triangle first side");
        double triFirstSide = scanner.nextDouble();
        System.out.println("Type triangle second side");
        double triSecondSide = scanner.nextDouble();
        Figure triangle = new Triangle(triFirstSide, triSecondSide);

        Figure[] figureArray = new Figure[3];
        figureArray[0] = rectangle;
        figureArray[1] = circle;
        figureArray[2] = triangle;

        for (int i = 0; i < figureArray.length; i++) {
            System.out.println("Figure area: " + figureArray[i].getArea());
            System.out.println("Figure perimeter: " + figureArray[i].getPerimeter()+"\n");
        }
    }
}
