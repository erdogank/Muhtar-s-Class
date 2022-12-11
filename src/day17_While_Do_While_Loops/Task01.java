package day17_While_Do_While_Loops;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a positive number");
        int num1 = scan.nextInt();
        System.out.println("Enter another positive number");
        int num2 = scan.nextInt();


        int result = 0;

        if (num1 >= 0 && num2 >= 0) {

            while (num1 >= num2) {

                num1 = num1 - num2;
                result++;
            }

            System.out.println("result = " + result+" with the remainder of "+num1);
        }
    }
}




