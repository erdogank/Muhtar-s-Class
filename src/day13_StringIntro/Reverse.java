package day13_StringIntro;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        String word= input.next();
        int length=word.length();

        if(length<5){
            System.out.println("Too short!");
        }else if(length>5){
            System.out.println("Too long!");


            }else{
            System.out.println(word.charAt(word.length()-1)+""+word.charAt(word.length()-2)+word.charAt(word.length()-3)+word.charAt(word.length()-4)+word.charAt(word.length()-5));
        }


        }
    }

