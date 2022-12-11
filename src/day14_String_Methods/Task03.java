package day14_String_Methods;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter a word");

        String word = input.nextLine();

        char charx =word.charAt(0);

        String wordx= word.substring(1);

        if(word.charAt(0)=='x'){
            System.out.println(wordx);

        }else{

            System.out.println(word);
        }

    }
}
