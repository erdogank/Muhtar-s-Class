package day24_VoidAndReturn;

import java.util.Arrays;

public class Task08ReversedArray {

    public static void main(String[] args) {

     int[] reversearr = reversedArray(new int[]{10, 20, 30, 40});

        System.out.println(Arrays.toString(reversearr));







    }


    public static int[] reversedArray(int[] arr){

        int[] reversedarr = new int[arr.length];

        for (int i = arr.length-1,j=0; i >=0 ; i--, j++) {

            reversedarr[j]=arr[i];

        }


        return reversedarr;





    }






}
