package Day20_Arrays;

import java.util.*;

public class Task05ItemName_Price {

    public static void main(String[] args) {



        String[] items  = new String[5];
        double[] prices = new double[5];


        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <5 ; i++) {

            System.out.println("please enter an item");
            items[i] = scan.next();
            System.out.println("please enter the price of "+ items[i]);
            prices[i] = scan.nextDouble();

        }
        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));

        System.out.println("***********************");

        double sum = 0;

        for (int i = 0; i <5 ; i++) {

            sum+= prices[i];

        }
        System.out.println(sum);
        System.out.println("***************************");

        for (int i = 0; i < 5; i++) {


            System.out.println(items[i]+" -- "+prices[i]);
        }











    }
}
