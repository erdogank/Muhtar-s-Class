package day14_String_Methods;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("enter a word");
        String word1 = input.nextLine();

        System.out.println("enter another word");
        String word2 = input.nextLine();

        word1=word1.substring(1);

        word2=word2.substring(1);

        System.out.println(word1+word2);

    }
}
