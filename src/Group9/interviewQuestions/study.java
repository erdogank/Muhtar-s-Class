package Group9.interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class study {

    public static void main(String[] args) {

        /*
        Given an array, find the most frequent element in it:
        {0,1,2,3,1,2,0,1} → 1
         */

        int[] array = {3,0, 1, 2, 3, 1, 2, 0, 1,3,4,3};
// 0 -> 2 times
// 1 -> 3 times
// 2 -> 2 times
// 3 -> 1 time
        int count2 = 0; //occurrence of the most frequent number
        int mostFreqNum = 0; //most frequent number itself
        for (int i = 0; i < array.length; i++) {
            int count1 = 0; //occurrence of current number
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count1++;
                }

            }
//compare occurrence of current number with occurrence of most freq.num.
            if (count1 > count2) {
                count2 = count1;
                mostFreqNum = array[i];
            }
        }
        System.out.println("Most frequent number is: "+mostFreqNum+" and it's occurrence is "+ count2+" times");

    }
}


