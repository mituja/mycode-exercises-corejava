package exercises.exercises.arrays;

public class Arrays {

    public String[] fiveLetterArray(){
        String alphabet = "abcdefghijklmnoprstquwyz";
        String[] fiveLetterArray = new String[5];

        for (int i = 0; i < fiveLetterArray.length; i++) {
            fiveLetterArray[i] = String.valueOf(alphabet.charAt(i));
        }

        return fiveLetterArray;
    }

    public int[] revertArray(int[] array){
        return new int[] {array[2], array[1], array[0]};
    }

}
