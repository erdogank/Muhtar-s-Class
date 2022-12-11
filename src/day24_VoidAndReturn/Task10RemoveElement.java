package day24_VoidAndReturn;

import java.util.Arrays;

public class Task10RemoveElement {


    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50, 60};

        int[] removed = new int[array.length-1];

        for (int i = 0, j=0; i < array.length ; i++) {

         if(i!=2){

              removed[j]=array[i];
                j++;


            }



        }
        System.out.println(Arrays.toString(removed));








    }
}
