package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class Task01 {

    public static void main(String[] args) {


        int[][] array = { {1,2,3}, {4,5,6},{40,50,60}};

        int[][] reverse = new int[array.length][];

        for (int i = array.length - 1,k = 0; i >= 0; i--,k++) {

            reverse[k] = new int[array[i].length];

            for (int j = array[i].length - 1,l = 0; j >= 0; j--,l++) {

                reverse[k][l] = array[i][j];

            }

        }

        System.out.println(Arrays.deepToString(reverse));
// OUTPUT: [[6, 5, 4], [3, 2, 1]]
    }
}