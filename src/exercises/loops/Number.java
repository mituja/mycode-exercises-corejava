package exercises.loops;

public class Number {

    private int number;

    public Number(int number) {
        this.number = number;
    }

    public void printDigits(){
        String stringNumber = String.valueOf(number);
        for (int i = stringNumber.length(); i > 0; i--) {
            System.out.println(stringNumber.charAt(i-1));
        }
    }

    public static void main(String[] args) {
        new Number(321).printDigits();
    }
}
