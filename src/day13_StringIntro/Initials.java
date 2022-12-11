package day13_StringIntro;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("please enter your name");
        String firstName = scan.next();
        System.out.println("please enter your surname");
        String lastName =scan.next();

        char f=firstName.charAt(0);//to call the first character of the string we use 0.
        char l=lastName.charAt(0);//string index starts from 0.

        String initial=f+"."+l;

        System.out.println("initial = " + initial);

        //lenght method
        //length();
        int length=firstName.length();
        System.out.println("length = " + length);

        char lastchar = firstName.charAt(firstName.length() - 1);//to print last char.

        System.out.println("lastchar = " + lastchar);

        //It is a good day to learn java.

        String sentence="It is a good day to learn java.";

        sentence=sentence.toUpperCase();//TO UPPERCASE

        System.out.println("sentence = " + sentence);

        sentence=sentence.toLowerCase();//tolowercase

        System.out.println("sentence = " + sentence);






    }

    }

