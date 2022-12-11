package Day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractise3 {
    public static void main(String[] args) {



        Scanner scan= new Scanner(System.in);
        System.out.println("how many numbers you wanna enter?");
        int num = scan.nextInt();//length

        if(num<=0){

            System.out.println("invalid number");
            System.exit(0);
        }

        int[] numbers = new int[num];

        for (int i = 0; i < num ; i++) {

            System.out.println("enter a number");
            numbers[i]=scan.nextInt();

        }


        System.out.println(Arrays.toString(numbers));

    }
}
