package day17_While_Do_While_Loops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int number= input.nextInt();
        int sum=0;

        while(number>0){
            sum+=number;
        }



    }
}
