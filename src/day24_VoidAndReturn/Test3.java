package day24_VoidAndReturn;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {


        int arr[] = {2, 3, 0, 0, 5, 0, 8};

        int zeroToEnd[] = new int[arr.length];

        int j=0;

        for (int i = 0; i <arr.length ; i++) {

            if(arr[i]!=0){

                zeroToEnd[j++]=arr[i];
            }


        }
        System.out.println(Arrays.toString(zeroToEnd));





    }
}
