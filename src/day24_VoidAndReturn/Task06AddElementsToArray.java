package day24_VoidAndReturn;

import java.util.Arrays;

public class Task06AddElementsToArray {

    public static void main(String[] args) {

        int[] newarr = addElementsToArray(new int[]{1, 2, 3,4},7);

        System.out.println(Arrays.toString(newarr));    }


    public static int[]addElementsToArray(int[] arr, int num){

        int[] added = new int[arr.length+1]; //create a new array one longer then the given one
        added = Arrays.copyOf(arr,arr.length+1); //copy all elemnts to the new array
        added[arr.length] = num; // assignt the given number to the last elemnt of new array


return added;

    }




}
