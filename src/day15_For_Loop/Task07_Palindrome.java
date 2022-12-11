package day15_For_Loop;

import java.util.Scanner;

public class Task07_Palindrome {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter a word");

        String word = scan.nextLine();

        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {

            reverse += word.charAt(i);
        }
        System.out.println(reverse);

        reverse=reverse.toLowerCase();
        word=word.toLowerCase();

        if(word.equals(reverse)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
