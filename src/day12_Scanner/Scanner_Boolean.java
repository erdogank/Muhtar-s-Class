package day12_Scanner;

import java.util.Scanner;

public class Scanner_Boolean {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Please enter true or false\n");

        boolean result = input.nextBoolean();

        if(result==true){
            System.out.println("\nyou are wellcome");
        }else{
            System.out.println("\nunfortunately the event for couples");
        }
    }
}
