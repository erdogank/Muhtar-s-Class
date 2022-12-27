package day16_ForLoopStringPractice;

import java.util.Scanner;

public class UniqueChars {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a string");
        String word= scan.next();


        String unique="";//to put the unique chars inside

        for(int i=0;i<word.length();i++){//i=index numbers of word (starting from 0)

            char ch=word.charAt(i);

               //index of first char                  last index of first char
            if(word.indexOf(word.charAt(i))==word.lastIndexOf(word.charAt(i))){
                unique+=ch+" ";
            }

        }System.out.println(unique);
    }
}
