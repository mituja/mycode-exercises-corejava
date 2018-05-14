package exercises.files;
/*
Napisz program, który pobierze od użytkownika ścieżkę do pliku i wyświetli zawartość
pliku na ekranie wraz z informacją ile linii znajduje się w pliku.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TextFileReader {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineCounter = 0;
        String nextLine = null;
        StringBuilder textBuilder = new StringBuilder();

        System.out.println("Type the filename:");
        String fileName = sc.nextLine();
        String filePath = "/home/kuba/Desktop/" + fileName + ".txt";

        try (BufferedReader bf = new BufferedReader(new FileReader(filePath))) {
            boolean cancontinue = true;

            while (cancontinue) {
                nextLine = bf.readLine();
                if (nextLine == null) {
                    cancontinue = false;
                } else {
                    textBuilder.append(nextLine + "\n");
                    lineCounter++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Number of lines: " + lineCounter);
        System.out.println(textBuilder);
    }
}
