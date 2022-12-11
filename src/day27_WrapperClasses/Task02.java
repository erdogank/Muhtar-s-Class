package day27_WrapperClasses;

import java.util.Arrays;

public class Task02 {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int index1 = 2;
        int index2 = 4;

        arr= swapElements(arr, index1,index2);



        System.out.println(Arrays.toString(arr));


    }

    public static int[] swapElements(int[] arr, int ind1, int ind2){

        int arr2 = arr[ind1];
        int arr4 = arr[ind2];
        arr[ind1] = arr4;
        arr[ind2]= arr2;

        return arr;
    }

    public static String[] swapElements(String[] arr, int ind1, int ind2){

        String arr2 = arr[ind1];
        String arr4 = arr[ind2];
        arr[ind1] = arr4;
        arr[ind2]= arr2;

        return arr;
    }


}
