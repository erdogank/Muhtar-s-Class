package day13_StringIntro;

import java.util.Scanner;

public class Task_String_Three_Letter {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("enter a word");
        String word= input.nextLine();


        int length=word.length();

        if(length == 0){
            System.out.println("string is empty");

        }else if(length>0 && length<=3){
            System.out.println(word);

        }else{
            System.out.println(word.charAt(word.length()-3)+""+word.charAt(word.length()-2)+""+word.charAt(word.length()-1));

        }

    }
}
