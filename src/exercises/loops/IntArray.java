package exercises.loops;

public class IntArray {

    public String printNumbers(int[] array){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1){
                sb.append(array[i] + ", ");
            } else {
                sb.append(array[i] + "]");
            }
        }

        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        System.out.println(new IntArray().printNumbers(new int[]{123, 5, 22}));
    }
}
