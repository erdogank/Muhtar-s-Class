package day14_String_Methods;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter a word");
        String word = input.nextLine();

        char firstChar= word.charAt(0);

        if(firstChar>=48&&firstChar<=57){
            System.out.println("first character is digit");
        }else if(firstChar>=65&&firstChar<=90){
            System.out.println("first character is uppercase letter");
        }else if(firstChar>=97&&firstChar<=122){
            System.out.println("first character is lowercase letter");
        }else{
            System.out.println("first character is special character ");
        }
    }
}
