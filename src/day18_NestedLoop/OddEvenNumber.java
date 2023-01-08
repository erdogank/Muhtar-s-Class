package day18_NestedLoop;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("please enter a number");
            int number = scan.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is even number");
            } else {
                System.out.println(number + " is odd number");
            }
            System.out.println("would you like to enter another number?");
            String answer = scan.next();

            while (!(answer.equals("yes") || answer.equals("no"))) {

                System.out.println("invalid entry, please enter yes or no");
                answer = scan.next();
            }


            if (answer.equals("no")) {
                System.out.println("thank you for using our program");
                break;
            }


        }


    }}


