package day12_Scanner;

import java.util.Scanner;

public class MilestoKm {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Please enter the distance as miles");//1 miles equal to 1.609 km

        double miles= input.nextDouble();

        double km = miles*1.609;

        System.out.println(miles+ " miles equal to "+km+ " kilometers");

     input.close();
    }
}
