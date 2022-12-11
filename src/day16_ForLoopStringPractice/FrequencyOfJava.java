package day16_ForLoopStringPractice;

import java.util.Scanner;

public class FrequencyOfJava {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter a sentence");
        String sentence = input.nextLine();
        System.out.println("enter a word");//to check the count of this word in given sentence
        String checkWord= input.next();
        int amountOfcheckWord = 0;

        for (int i = 0; i <= sentence.length()-checkWord.length(); i++) {
            String findCheckWord = sentence.substring(i, i+checkWord.length());
            if (findCheckWord.equalsIgnoreCase(checkWord)) {
                amountOfcheckWord++;
            }
        }
        System.out.println("number of "+checkWord+": "+amountOfcheckWord);
    }
}