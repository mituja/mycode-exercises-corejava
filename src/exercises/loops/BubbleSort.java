package exercises.loops;

public class BubbleSort {

    public int[] sort(int[] array) {
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] sortedArray = new BubbleSort().sort(new int[]{7, 4, 6, 1, 10});
        for (int element : sortedArray) {
            System.out.println(element);
        }
    }
}
