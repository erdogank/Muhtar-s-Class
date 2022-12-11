package day19_LoopPractices;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("please enter the side of the square");
            double side = scan.nextDouble();

            while (!(side > 0)) {
                System.out.println("invalid entry, the program will terminate now");
                System.exit(0);
            }
            double area = side * side;
            double perimeter = side * 4;


            System.out.println("area = " + area);
            System.out.println("perimeter = " + perimeter);

            System.out.println("would you like to calculate another one?");
            String yesOrNo = scan.next();

            if (yesOrNo.equals("no")) {

                System.out.println("Thank you for using Cydeo Square Calculator App");
                System.exit(0);

            }
            while (!(yesOrNo.contains("yes") || yesOrNo.contains("no"))) {
                System.out.println("invalid entry, please try again with yes or no");
                yesOrNo = scan.next();

                if (yesOrNo.equals("no")) {

                    System.out.println("Thank you for using Cydeo Square Calculator App");
                    System.exit(0);


                }


            }

        }
    }
}
