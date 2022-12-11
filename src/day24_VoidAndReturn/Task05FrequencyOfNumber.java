package day24_VoidAndReturn;

import java.util.Arrays;

public class Task05FrequencyOfNumber {
    public static void main(String[] args) {

        int result = frequencyOfNoInArray(new int[]{1, 1, 1, 1, 1, 2, 2},1);

        System.out.println("result = " + result);















    }

    public static int frequencyOfNoInArray(int[] arr, int number){


        int count = 0;

        for (int each : arr) {

            if(each==number){

                count++;
            }

        }




        return count;



    }





}
