package day21_ForEachLoop;

import java.util.Arrays;

public class Task04Palindromes {

    public static void main(String[] args) {


        String[] words = {"anna", "level", "Java"};

        String reversedEach="";

        int count = 0;

        for (String each : words) {

            reversedEach=""; //to empty this value to compare with the each element of the words.

            for (int i = each.length()-1; i >= 0 ; i--) {


                reversedEach +=each.charAt(i);

            }
            if(each.equals(reversedEach)){
                count++;
            }

        }
        System.out.println(count);



    }
}
