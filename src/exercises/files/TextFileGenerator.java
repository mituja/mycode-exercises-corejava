package exercises.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
Napisz program, który pobierze od użytkownika ścieżkę do pliku tekstowego oraz
kilka linijek tekstu (dopóki użytkownik nie wprowadzi „-” jako linijki) i zapisze
je do pliku tekstowego. Do wykonania tego zadania może Ci się przydać metoda
System.lineSeparator() zwracająca znak nowej linii (jeśli chciałbyś oddzielić linie
wprowadzone przez użytkownika).
 */
public class TextFileGenerator {

    public String getUserText(){
        Scanner sc = new Scanner(System.in);
        StringBuilder text = new StringBuilder();
        boolean cancontinue = true;

        while (cancontinue) {
            System.out.println("Type some text: ");
            String userTextLine = sc.nextLine();
            if (!userTextLine.equals("-")) {
                text.append(userTextLine + "\n");
            } else cancontinue = false;
        }

        return String.valueOf(text);
    }

    public String getFilePath(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type file name");
        String fileName = sc.nextLine();
        String filePath = "/home/kuba/Desktop/" + fileName + ".txt";
        return filePath;
    }

    public static void main(String[] args) {
        String userText = new TextFileGenerator().getUserText();
        String filePath = new TextFileGenerator().getFilePath();

        try (BufferedWriter bf = new BufferedWriter(new FileWriter(filePath))) {
            bf.write(userText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
