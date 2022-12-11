package day12_Scanner;

import java.util.Scanner;

public class SpeedLimit {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter your speed");
        int currentSpeed= input.nextInt();
        int speedLimit=55;
        int overLimit=currentSpeed-speedLimit;

        if(overLimit>0){

            System.out.println("you are driving over "+overLimit+" mph over the limit. Slow down.");
        }
        input.close();

    }
}
