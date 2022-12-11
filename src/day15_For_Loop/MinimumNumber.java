package day15_For_Loop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        int minNumber=-2147483647;

        for (int i = 0; i < 5; i++) {

            System.out.println("please enter a number");
            int number= input.nextInt();
            if(number<minNumber){
                minNumber=number;
            }
        }
        System.out.println("\n\nMinimum number is: "+minNumber);
    }
}
