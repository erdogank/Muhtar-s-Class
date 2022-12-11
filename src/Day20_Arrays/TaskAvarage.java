package Day20_Arrays;

import java.util.*;

public class TaskAvarage {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers you wanna enter");

        int length = scan.nextInt();

        int[] numarr =new int[length];

        for (int i = 0; i < numarr.length; i++) {

            System.out.println("please enter a number");

            numarr[i]=scan.nextInt();



        }
        double sum=0;



        for (int i = 0; i < numarr.length; i++) {

            sum+=numarr[i];



        }

        System.out.println("avarage = " + sum/ numarr.length);








    }
}
