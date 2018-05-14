package exercises.types;

import exercises.loops.BubbleSort;
import exercises.loops.IntArray;

import java.util.Scanner;

/*
Napisz program, który pobierze od użytkownika liczbę całkowitą N reprezentującą długość
tablicy a następnie poprosi o N kolejnych liczb uzupełniając nimi wcześniej stworzoną tablicę.
 Wyświetl na konsoli tablicę posortowaną w kolejności od najmniejszej do największej liczby,
 */
public class ArrayProducer {

    public int[] createArray(int arraySize){
        return new int[arraySize];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type array size:");
        int arraySize = sc.nextInt();

        int[] myArray = new ArrayProducer().createArray(arraySize);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Type a number: ");
            int number = sc.nextInt();
            myArray[i] = number;
        }

        int[] mySortedArray = new BubbleSort().sort(myArray);

        System.out.println(new IntArray().printNumbers(mySortedArray));
    }

}
