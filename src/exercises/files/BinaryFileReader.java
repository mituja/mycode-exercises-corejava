package exercises.files;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
Napisz program, który pobierze od użytkownika ścieżkę do pliku binarnego z datą urodzenia
a następnie wyświetli ją na ekranie.
 */
public class BinaryFileReader {

    public static void main(String[] args) {
        String filePath = new TextFileGenerator().getFilePath();
        int birthDay = 0;
        int birthMonth = 0;
        int birthYear = 0;

        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(filePath))) {
            birthYear = dataInputStream.readInt();
            birthMonth = dataInputStream.readInt();
            birthDay = dataInputStream.readInt();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Birth date: " + birthDay + "-" + birthMonth + "-" + birthYear);

    }
}
