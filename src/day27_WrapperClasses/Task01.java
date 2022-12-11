package day27_WrapperClasses;

import java.util.Arrays;

public class Task01 {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int index = 3;
        int element = 100;

        int[] newarr = insertElement(arr,index,element);

        System.out.println(Arrays.toString(newarr));

    }
    //insert a given element to a given index number of an array, returns new array
    public static int[] insertElement(int[] arr, int index, int element){

        int[] newarr = new int[arr.length + 1];

        if(index>arr.length){
            System.out.println("invalid index size");
            System.exit(0);
        }
        else {

            for (int i = 0; i < arr.length + 1; i++) {

                if (i < index) {
                    newarr[i] = arr[i];
                }
                if (i == index) {
                    newarr[i] = element;
                }
                if (i > index) {
                    newarr[i] = arr[i - 1];
                }

            }
        }
        return newarr;

    }

}
