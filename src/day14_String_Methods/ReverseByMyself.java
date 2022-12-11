package day14_String_Methods;

import java.util.Scanner;

public class ReverseByMyself {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter a word");
        String word= input.nextLine();
        String reverse="";


        for(int i=word.length()-1; i>=0; i--){
            reverse=reverse+word.charAt(i)+'x';
        }System.out.println("reverse = " + reverse);
    }
}
