package day15_For_Loop;

import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.println("enter a number");
        int n= scan.nextInt();

        if (n>=90&&n<=110||n>=190&&n<=210){
            System.out.println("true");

        }else{
            System.out.println("false");

        }

    }
}
