package exercises.loops;

public class ArrayFactory {

    public int number;

    public ArrayFactory(int number) {
        this.number = Math.abs(number);
    }

    public int[] oneDimension(){
        return new int[number];
    }

    public int[][] twoDimension(){
        return new int[number][number];
    }

    public int[][] matrix(){
        int[][] matrix = twoDimension();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == j){
                    matrix[i][j] = 1;
                } else{
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = new ArrayFactory(3).matrix();

        for (int i = 0; i < matrix.length; i++) {
            System.out.println("");
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
        }
    }
}
