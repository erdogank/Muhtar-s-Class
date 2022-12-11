package day15_For_Loop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int max=-2147483648;//smallest number of integer. any int will be bigger then this value




        for (int i = 0; i <5 ; i++) {

            System.out.println("please enter a number");
            int number= scan.nextInt();
            if(number>max){
                max=number;
            }
        }System.out.println("The biggest number is: "+max);


    }
}
