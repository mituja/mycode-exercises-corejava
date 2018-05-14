package exercises.binaryConv;

public class BinaryConv {

    public String convert(int number) {
        StringBuilder sb = new StringBuilder();
        int result = number / 2;
        sb.append(number % 2);

        while (result > 0) {
            sb.append(result % 2);
            result = result / 2;
        }

        return String.valueOf(sb.reverse());
    }

    public static void main(String[] args) {
        System.out.println(new BinaryConv().convert(128));
    }
}
