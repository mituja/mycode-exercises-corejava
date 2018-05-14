package exercises.collections;

import java.util.*;

/*
Napisz program, który będzie pobierał od użytkownika imiona. Program powinien pozwolić
użytkownikowi na wprowadzenie dowolnej liczby imion (wprowadzenie „-” jako imienia przerwie
wprowadzanie). Na zakończenie wypisz liczbę unikalnych imion.
 */
public class NameBase {

    public static void main(String[] args) {
        Set<String> nameSet = new HashSet<>();

        List nameList = new PairNames().nameListGenerator();

        nameSet.addAll(nameList);
        System.out.println(nameSet.size());
    }
}
