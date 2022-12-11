package day14_String_Methods;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("enter a word");
        String word1= input.nextLine();
        System.out.println("enter another word");
        String word2= input.nextLine();

        String word3=word2.substring(1);

        
        char char1 = word1.charAt(word1.length()-1);
        System.out.println("char1 = " + char1);
        char char2= word2.charAt(0);
        System.out.println("char2 = " + char2);

        if(char1==char2){

            System.out.println(word1+word3);

        }else{

            System.out.println(word1+word2);
        }

    }
}
