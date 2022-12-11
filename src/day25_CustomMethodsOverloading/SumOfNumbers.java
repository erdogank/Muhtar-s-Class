package day25_CustomMethodsOverloading;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("please enter a number");
        int num1= scan.nextInt();
        System.out.println("please enter another number");
        int num2= scan.nextInt();

       sumOf2Numbers(num1,num2);








    }

    public static void sumOf2Numbers(int num1, int num2) {



        int sum=0;
        sum=num1+num2;
        System.out.println("sum is: "+sum);




    }
}
