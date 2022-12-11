package day19_LoopPractices;

import java.util.Scanner;

public class FirstDoubleChar {
    public static void main(String[] args) {

        int count=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string!");
        String word = scanner.next();


        for (int i = 0; i < word.length(); i++) {

            count = 0;

            for (int j = 0; j <= i; j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                }
            }

            if (count==2) {

                System.out.println("first duplicated: "+word.charAt(i) + "");
                System.out.println("index number is: "+word.indexOf(word.charAt(i)));
                break;


        }

        }
    }
}