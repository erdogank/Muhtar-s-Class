package day13_StringIntro;

import java.util.Scanner;

public class Task_7_CheckWords {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("enter a word:");
        String word1= scan.next();
        System.out.println("enter another word:");
        String word2= scan.next();
        System.out.println("and the last one:");
        String word3= scan.next();

        int l1=word1.length();
        int l2=word2.length();
        int l3=word3.length();

        if(l1==l2&&l2==l3){
            System.out.println("all words are same lenght");

        }else if (l1==l2&&l2!=l3||l1==l3&&l3!=l2||l2==l3&&l1!=l3){
            System.out.println("Not Same nor Different lengths");
        }else{
            System.out.println("All different lenghts");
        }

    }
}
