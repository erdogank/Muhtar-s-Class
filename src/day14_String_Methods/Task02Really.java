package day14_String_Methods;

import java.util.Scanner;

public class Task02Really {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("please enter a word");
        String word= input.nextLine();

        String last2 =  word.substring(word.length()-2);
        //                                   sondan ikinci karakterden itibaren

        System.out.println("check = " + last2);

        if(last2.equals("ly")){
            System.out.println("really???");
        }else{
            System.out.println("never mind");
        }

    }
}
