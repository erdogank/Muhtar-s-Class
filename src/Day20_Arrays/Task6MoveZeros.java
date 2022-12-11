package Day20_Arrays;

import java.util.Arrays;

public class Task6MoveZeros {

    public static void main(String[] args) {



        int[] array = {10, 0, 5, 0, 1, 0};

        Arrays.sort(array);
        int[] reversedArray= new int[array.length];

        System.out.println(Arrays.toString(array));

        for (int i= array.length-1, j=0; i>=0&&j< array.length ; i--,j++) {

            reversedArray[j]=array[i];

        }
        System.out.println(Arrays.toString(reversedArray));







    }
}