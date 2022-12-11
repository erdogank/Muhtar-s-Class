package day17_While_Do_While_Loops;

import java.util.Scanner;

public class RemoveDublicates {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("enter something");
        String words= scan.nextLine();
        String str="";

        for(int i=0; i<words.length(); i++ ){

            if((str.contains(words.charAt(i)+""))){
                continue;


            }str+=words.charAt(i);

        }System.out.println("str = " + str);



    }
}
