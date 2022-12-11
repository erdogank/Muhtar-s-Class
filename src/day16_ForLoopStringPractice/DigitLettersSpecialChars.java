package day16_ForLoopStringPractice;

import java.util.Scanner;

public class DigitLettersSpecialChars {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        System.out.println("enter a string");
        String word= input.nextLine();
        String digits="";
        String letters="";
        String special="";

        for (int i = 0; i <word.length() ; i++) {

            if(word.charAt(i)>='a'&&word.charAt(i)<='z'||word.charAt(i)>='A'&&word.charAt(i)<='Z'){
                letters+=word.charAt(i);

            }else if(word.charAt(i)>='0'&&word.charAt(i)<='9'){
                digits+=word.charAt(i);
            }else{
                if(word.charAt(i)!=' ')
                special+=word.charAt(i);
            }

        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("special = " + special);






    }
}
