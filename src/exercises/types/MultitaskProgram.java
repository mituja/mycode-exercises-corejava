package exercises.types;
/*
Napisz program, który pobierze od użytkownika łańcuch znaków i wyświetli na konsoli jego
długość, informację czy jest to palindrom czy nie oraz jego odwróconą wartość.
 */

import exercises.loops.Inversion;
import exercises.palindrom.Palindrom;

import java.util.Scanner;

public class MultitaskProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type some characters");
        String text = sc.nextLine();

        System.out.println(text.length());
        System.out.println("Is palindrom? - " + new Palindrom().isPalindrom(text));
        new Inversion(text).invertString();
    }
}
