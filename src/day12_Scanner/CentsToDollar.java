package day12_Scanner;

import java.util.Scanner;

public class CentsToDollar {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter your money as cents");

        int cents= input.nextInt();

        int dollarAmount=cents/100;

        int centsLeft=cents%100;

        System.out.println(cents+" cents equal to:"+dollarAmount+" dollars and "+centsLeft+" cents");

        input.close();

    }
}
