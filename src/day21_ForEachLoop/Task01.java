package day21_ForEachLoop;


import java.util.Arrays;
import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        int[] nums = {5, 8, 6, 12, 23, 96, 632, 121, 565, 455,2};

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        int numberOfOdd = 0;
        int numberOfEven = 0;

        for (int each : nums) {

            if ((each % 2 == 0)) {
                numberOfEven++;
            } else {
                numberOfOdd++;
            }

        }

        System.out.println("numberOfEven = " + numberOfEven);
        System.out.println("numberOfOdd = " + numberOfOdd);

    }
}
