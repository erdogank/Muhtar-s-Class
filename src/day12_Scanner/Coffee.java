package day12_Scanner;

import java.util.Scanner;

public class Coffee {
    public static void main(String[] args) {

        Scanner want = new Scanner(System.in);

        System.out.println("What do you want to drink?\nEnter 1 for Tea\nEnter 2 for Coffee\nEnter 3 for Lemonade");
        int firstChoice = want.nextByte();
        int tea;
        int coffee;

        if(firstChoice == 1){
            System.out.println("Which tea do you want to drink?\nEnter 1 for Black Tea\nEnter 2 for Green Tea");
            tea = want.nextByte();
            String result1 = (tea == 1) ? "It is $2" : (tea == 2) ? "It is $3" : "Invalid Number";
            System.out.println(result1);

        } else if (firstChoice == 2) {
            System.out.println("Which coffee do you want to drink?\nEnter 1 for Filter Coffee\nEnter 2 for Espresso\nEnter 3 for Latte");
            coffee = want.nextByte();
            String result2 = (coffee == 1) ? "It is $3" : (coffee == 2) ? "It is $4" : (coffee == 3) ? "It is $4.5" : "Invalid Number";
            System.out.println(result2);

        } else if (firstChoice == 3) {
            System.out.println("It is $8");

        } else {
            System.out.println("Invalid Number!");
        }

    }
}