package exercises.comparizon;

public class Main {

    public static void main(String[] args) {
        Human someHuman = new Human("Jan", "Kowalski", 1234);
        Human someAnotherHuman = new Human("Jan", "Kowalski", 1234);
        Human someOtherHuman = new Human("Jan", "Kowalski", 2543);

        //Besides that someHuman and someAnotherHuman are two objects created separately,
        //equals return true by Overriding equals&hashCode at Human class.
        System.out.println(someHuman.equals(someAnotherHuman));

        System.out.println(someAnotherHuman.equals(someOtherHuman));
    }
}
