package day17_While_Do_While_Loops;

import java.util.Scanner;

public class Task2_SumOfPositiveNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number");
        int number=input.nextInt();
        int sum = 0;

        while (number>0){
            sum+=number;
            System.out.println("Enter a positive number");
            number=input.nextInt();

        }
        System.out.println("sum = " + sum);

    }
}