package exercises.interfaces;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Addition().witamSie();

        Main main = new Main();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication();
        } else {
            computation = new Addition();
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);

        Witam.zegnam();
    }

    private boolean shouldMultiply() {
        System.out.println("Do you want to compute multiplication? Type 'yes' or 'no'. If no, then addition will be computed.");
        Scanner sc = new Scanner(System.in);

        String order = sc.nextLine();
        if (order.equals("yes")){
            return true;
        }
        return false;
    }

    private double getArgument() {
        System.out.println("Type a number to compute: ");
        Scanner sc = new Scanner(System.in);
        double argument = sc.nextDouble();
        return argument;
    }
}

