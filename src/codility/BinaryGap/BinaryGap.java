package codility.BinaryGap;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BinaryGap {

    public int solution(int N) {

        String binaryString = Integer.toBinaryString(N);
        System.out.println("number " + N);
        System.out.println("binary number " + binaryString);

        List<String> gapsList = new LinkedList<String>(Arrays.asList(binaryString.split("1")));

        //removing blank entries after spliting
        for (int i = 0; i < gapsList.size(); i++) {
            if (gapsList.get(i).equals("")) {
                gapsList.remove(i);
                i--;
            }
        }

        //removing first entry if binarynumber starts from 0
        if (binaryString.charAt(0) == 48) {
            gapsList.remove(0);
        }

        //removing last entry if binarynumber ends with 0
        if (binaryString.charAt(binaryString.length() - 1) == 48) {
            gapsList.remove(gapsList.size() - 1);
        }

        int longestGap = 0;
        int gap = 0;

        //getting longest gap from gapslist
        for (int i = 0; i < gapsList.size(); i++) {
            gap = gapsList.get(i).length();

            if (gap > longestGap) {
                longestGap = gap;
                System.out.println("longest gap " + longestGap);
            }
        }

        return longestGap;
    }



    public int mySolution(int N) {

        String s = Integer.toBinaryString(N);

        String[] splitedString = s.split("1");

        int longestGap = 0;
        int gap = 0;

        for (int i = 0; i < splitedString.length; i++) {

            gap = splitedString[i].length();

            if (gap > longestGap){
                longestGap = gap;
            }
        }

        return longestGap;
    }



    public static void main(String[] args) {
        BinaryGap binaryGap = new BinaryGap();
        System.out.println("solution "+binaryGap.solution(1024));
        System.out.println("mysolution "+binaryGap.mySolution(1024));
    }
}
