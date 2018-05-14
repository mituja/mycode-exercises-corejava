package exercises.files;

import java.io.*;
import java.util.Scanner;

/*
Napisz program, który poprosi użytkownika nazwę pliku wyjściowego oraz o podanie
swojej daty urodzenia (osobno dzień, miesiąc i rok) a następnie zapisze te dane
jako trzy osobne liczby binarnie.
 */
public class BinaryFileGenerator {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type birth day:");
        int birthDay = sc.nextInt();
        System.out.println("Type birth month:");
        int birthMonth = sc.nextInt();
        System.out.println("Type birth year:");
        int birthYear = sc.nextInt();

        String filePath = new TextFileGenerator().getFilePath();

        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(filePath))) {
            dataOutputStream.writeInt(birthDay);
            dataOutputStream.writeInt(birthMonth);
            dataOutputStream.writeInt(birthYear);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
