package day13_StringIntro;

import java.util.Scanner;

public class Task_2_Longest_String {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your first sentence");
        String st1= input.nextLine();
        System.out.println("Please enter your second sentence");
        String st2= input.nextLine();

        int l1=st1.length();
        int l2=st2.length();
        String longest="";


        if(l1>l2){
            longest=st1;
            System.out.println("Longest sentence is: "+"\""+longest+"\""+"\nthe character count is: "+l1);

        }else if(l2>l1){
            longest=st2;
            System.out.println("Longest sentence is: "+"\""+longest+"\""+"\nthe character count is: "+l2);

        }else{
            System.out.println("Sentences are equally long.");

        }



    }
}
