package exercises.conversion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //System.out.println(new Main().intMultiplication());
        //System.out.println(new Main().doubleMultiplication());
        //System.out.println(new Main().division());
        //System.out.println(new Main().boxing());
    }

    public int intMultiplication() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type first number:");
        int firstInt = sc.nextInt();
        return (int) (firstInt * Math.PI);
    }

    public double doubleMultiplication() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type first number:");
        double firstDouble = sc.nextDouble();
        return firstDouble * Math.PI;
    }

    public double division() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type first number:");
        int firstInt = sc.nextInt();
        System.out.println("Type second number:");
        int secondInt = sc.nextInt();
        return (double) firstInt / secondInt;
    }

    public int boxing(){
        char letter = 'A';
        int number;
        number = letter;
        return number;
    }

}