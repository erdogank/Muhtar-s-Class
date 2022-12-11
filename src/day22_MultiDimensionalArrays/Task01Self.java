package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class Task01Self {
    public static void main(String[] args) {


        int[][] array2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};

        int[][] reversed2D = new int[array2D.length][];

        int[][] revrev2D= new int[array2D.length][];



        for (int i = array2D.length-1, j=0; i >=0 ; i--, j++) {

            reversed2D[j] = array2D[i];
        }
        for (int i = 0; i <reversed2D.length ; i++) {

           //System.out.println(Arrays.toString(reversed2D[i]));

            for (int j = reversed2D[i].length-1,k=0; j >=0&&k<reversed2D[i].length ; j--,k++) {

                //System.out.println();

                reversed2D[i][j] = reversed2D[i][k];

            }
            System.out.println(Arrays.deepToString(reversed2D));





        }


        //System.out.println(Arrays.deepToString(reversed2D));








    }
}
/**
 * 1. Write a program that can reverse a two dimensional array (return new array)
 * Ex:
 * array = { {1,2,3}, {4,5,6}};
 * output:
 * reverse = { {6,5,4}, {3,2,1},};
 */
