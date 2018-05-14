package exercises.collections;

import java.util.*;

/*
Napisz program, który będzie pobierał od użytkownika imiona par dopóki nie wprowadzi
imienia „-”, następnie poproś użytkownika o podanie jednego z wcześniej wprowadzonych
imion i wyświetl imię odpowiadającego mu partnera.
 */
public class PairNames {

    public List nameListGenerator() {
        Scanner sc = new Scanner(System.in);
        List<String> nameList = new ArrayList<>();
        boolean cancontinue = true;

        while (cancontinue) {
            System.out.println("Type a name:");
            String name = sc.nextLine();
            if (!name.equals("-")) {
                nameList.add(name);
            } else cancontinue = false;
        }
        return nameList;
    }

    public void searchPairNameInMap(Map<String, String> map) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a name of a partner:");
        String name = sc.nextLine();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            if (key.equals(name)) {
                System.out.println("Pair for " + name + " is " + value);
            } else if (value.equals(name)) {
                System.out.println("Pair for " + name + " is " + key);
            }
        }
    }

    public static void main(String[] args) {
        List namesList = new PairNames().nameListGenerator();
        Map<String, String> pairsMap = new HashMap<>();

        for (int i = 0; i < namesList.size() - 1; i += 2) {
            pairsMap.put(String.valueOf(namesList.get(i)), String.valueOf(namesList.get(i + 1)));
        }

        new PairNames().searchPairNameInMap(pairsMap);
    }
}
