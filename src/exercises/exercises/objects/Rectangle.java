package exercises.exercises.objects;


public class Rectangle {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double getField() {
        return length * width;
    }

    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    public double getDiagonal() {
        return Math.sqrt((length * length) + (width * width));
    }
}
