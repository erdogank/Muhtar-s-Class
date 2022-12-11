package day19_LoopPractices;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        while(true) {

            System.out.println("please enter the radius of the circle");
            double radius= scan.nextDouble();

            while(!(radius>0)){
                System.out.println("invalid entry");
                System.exit(0);
            }
            final double pi=3.14;
            double diameter = 2 * radius;
            double area = radius * radius * pi;
            double perimeter = diameter * pi;

            System.out.println("diameter = " + diameter);
            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);

            System.out.println("would you like to calculate another one?");
            String yesOrNo = scan.next().toLowerCase();

            if (yesOrNo.equals("no")) {

                System.out.println("Thank you for using Cydeo Circle Calculator App");
                System.exit(0);

            }


        }

    }
}
