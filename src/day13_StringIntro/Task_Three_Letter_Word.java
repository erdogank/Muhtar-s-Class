package day13_StringIntro;

import java.util.Scanner;

public class Task_Three_Letter_Word {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("enter three letter word with an a in the middle");
        String word= input.next();

        int length=word.length();
        char middle=word.charAt(1);

        if(length==3){
            if(middle=='a'){
                System.out.println("Cool word");
            }else{
                System.out.println("Okay word");
            }
        }else if(length>3){
            System.out.println("Word is too long");
        }else{
            System.out.println("Word is too short");
        }

    }
}
