package exercises.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number: ");

        double number = 0;

        try {
            number = sc.nextDouble();
        } catch (InputMismatchException e){
            System.out.println("Value must be a number!");
        }


        try {
            if (number < 0) {
                throw new IllegalArgumentException();
            } else {
                double result = Math.sqrt(number);
                System.out.println(result);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Number cannot have a negative value!");
            ;
        }
    }
}
