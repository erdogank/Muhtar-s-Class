package day24_VoidAndReturn;

import java.util.Arrays;

public class Task7Merge {

    public static void main(String[] args) {

        int[] arr3 = mergeTwoArrays(new int[]{1, 2, 3}, new int[]{4, 5, 6,7});



        System.out.println(Arrays.toString(arr3));



    }

    public static int[] mergeTwoArrays (int[] arr1,int[] arr2){




        int[] arr3 =Arrays.copyOf(arr1,arr1.length+arr2.length);

        for (int i = arr1.length,j=0; i < arr3.length; i++,j++) {

            arr3[i] = arr2[j];





        }

        return arr3;






    }







}
