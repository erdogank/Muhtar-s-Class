package day13_StringIntro;

import java.util.Scanner;

public class Practice_Task_One {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("please write a sentence down:");
        String sentence= input.nextLine();

        char firstLetter=sentence.charAt(0);
        int lenght=sentence.length();
        char lastLetter=sentence.charAt(sentence.length()-2);

        System.out.println("first letter is: "+firstLetter+"\nlast letter is: "+lastLetter);






    }
}
