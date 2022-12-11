package Group9;

import java.util.Arrays;

public class Task02 {

    public static void main(String[] args) {

        int[] arr = {4, 9, 1,3, 6, 4,3,1};



        int[] leftSide = {};
        int[] rightSide = {};

        int sumleft = 0;
        int sumright = 0;

        int flag = 0;

        for (int i = 1; i <arr.length ; i++) {

            sumleft = 0;
            sumright = 0;

            leftSide = Arrays.copyOfRange(arr,0,i);

            for (int each : leftSide) {
                sumleft+=each;
            }
            rightSide = Arrays.copyOfRange(arr,i+1,arr.length);

            for (int each : rightSide) {
                sumright+=each;

            }

            if(sumright==sumleft){
                flag++;
                System.out.println(i+". index number which is: "+arr[i]);
                break;
            }


        }

        if(flag == 0){
            System.out.println("it is not possible with this array");
        }


    }
}
