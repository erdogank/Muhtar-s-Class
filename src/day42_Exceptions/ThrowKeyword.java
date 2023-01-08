package day42_Exceptions;

import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("please enter your age");

        int age = scan.nextInt();
        if(age<0){
            throw new IllegalArgumentException("age can not be negative "+age);
        }
        if(age<21)
            throw new RuntimeException("you are not eligible, you must be more then 21,but  your age is "+age);
        if(age>21)
            System.out.println("you are eligible");
    }



}
