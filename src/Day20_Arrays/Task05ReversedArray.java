package Day20_Arrays;

import java.util.Arrays;

public class Task05ReversedArray {

    public static void main(String[] args) {


        int[] array = {1,2,3,4,5};

        int[] reversedArray = new int[array.length];

        for (int i = array.length-1, j=0; i >=0&&j< array.length ; i--,j++) {

            reversedArray[j] = array[i];        }

        System.out.println(Arrays.toString(reversedArray));


    }
}
