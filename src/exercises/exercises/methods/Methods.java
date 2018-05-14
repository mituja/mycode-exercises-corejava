package exercises.exercises.methods;

public class Methods {

    public static void main(String[] args) {
        //System.out.println("My age is " + new Methods().myAge());
        //System.out.println("My name is " + new Methods().myName());
        //new Methods().someCalculation(3,2);
        //System.out.println(new Methods().isEven(6));
        //System.out.println(new Methods().isDividable(15));
        //System.out.println(new Methods().cubedNumber(2));
        //System.out.println(new Methods().square(2));
        System.out.println(new Methods().isTriangle(1,2,2));

    }

    public int myAge() {
        return 25;
    }

    public String myName() {
        return "Marita";
    }

    public void someCalculation(int num1, int num2) {
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public boolean isDividable(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }

    public int cubedNumber(int number){
        return (int) Math.pow(number, 3);
    }

    public double square(int number){
        return Math.sqrt(number);
    }

    public boolean isTriangle(int a, int b, int c){
        int longestSide;
        int secondSide;
        int thirdSide;

        if (a > b){
            longestSide = a;
            secondSide = b;
            thirdSide = c;
        } else if (c > b){
            longestSide = c;
            secondSide = a;
            thirdSide = b;
        } else {
            longestSide = b;
            secondSide = a;
            thirdSide = c;
        }

        if (longestSide < secondSide + thirdSide){
            return true;
        } else return false;
    }
}