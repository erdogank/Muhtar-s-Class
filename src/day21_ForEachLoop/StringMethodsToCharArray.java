package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethodsToCharArray {

    public static void main(String[] args) {

        String word = "Erdogan";

        char[] erdogan =word.toCharArray();


        System.out.println(Arrays.toString(erdogan));

        for (char each : erdogan) {

            System.out.println(each);

        }






    }
}
