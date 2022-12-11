package day16_ForLoopStringPractice;

import java.util.Scanner;

public class HowManyPosNeg {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int positive=0;
        int negative=0;

        for (int i = 1; i <=5 ; i++) {
            System.out.println("please enter a number");
            int number= scan.nextInt();

            if(number>0){
                positive++;
            }if(number<0){
                negative++;
            }

        }
        System.out.println("positive = " + positive);
        System.out.println("negative = " + negative);
    }
}
