package day17_While_Do_While_Loops;

import java.util.Scanner;

public class Proposal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Will you marry me?");
        System.out.println("yes or no");
        String answer= scan.next().toLowerCase();

        while(!(answer.equals("yes")|| answer.equals("no"))){

            System.err.println("invalid entry");
            System.err.println("yes or no");
            answer=scan.next().toLowerCase();
        }
        if(answer.equalsIgnoreCase("yes")){
            System.out.println("congrats");
        }else if(answer.equalsIgnoreCase("no")){
            System.out.println("I will see you in hell");
        }








    }
}
