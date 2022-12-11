package Day20_Arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TaskNumber1To100 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int[] arrnum = new int[10];



        for (int i = 0; i < arrnum.length ; i++) {

            System.out.println("please enter a number");

            int number = scan.nextInt();

            arrnum[i] = number;
        }

        int max = arrnum[0];
        int min = arrnum[0];

        for (int i = 0; i < arrnum.length; i++) {



            if(arrnum[i]>max) {
                max = arrnum[i];
            }

                if(arrnum[i]<min) {
                    min = arrnum[i];
                }
        }

        System.out.println(Arrays.toString(arrnum));
        System.out.println("max is = "+max);
        System.out.println("min = " + min);











    }
}
