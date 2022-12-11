package Day20_Arrays;

import java.util.Arrays;

public class ArrayInt {
    public static void main(String[] args) {

        int[] number={10, 20, 50, 70};

        System.out.println(Arrays.toString(number));

        int[] scores = new int [5];
        scores[1]=85;

        System.out.println(Arrays.toString(scores));

        scores[scores.length-1]=95;
        scores[0]=65;
        scores[3]=75;
        scores[2]=55;

        System.out.println(Arrays.toString(scores));

    }
}
