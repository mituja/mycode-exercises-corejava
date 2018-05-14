package exercises.loops;

public class Loops {

    public void showNumbers(int number){
        for (int i = 0; i < number; i++) {
            System.out.println(i);
        }
    }

    public void showAnotherNumbers(int number){
        int index = 0;
        while (index < number){
            System.out.println(index);
            index++;
        }
    }


    public static void main(String[] args) {
        //new Loops().showNumbers(10);
        //new Loops().showAnotherNumbers(10);
    }
}
