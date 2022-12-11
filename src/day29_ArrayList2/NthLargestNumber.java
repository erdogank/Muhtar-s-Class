package day29_ArrayList2;

import java.util.*;


public class NthLargestNumber {

    public static void main(String[] args) {

        //write a program that can return the nth largest number


        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

        int n = 4;


        for (int i = 1; i <n; i++) {

            nums.removeIf(p-> p==Collections.max(nums));
        }


        System.out.println(Collections.max(nums));










    }
}
