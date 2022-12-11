package day12_Scanner;

import java.util.Locale;
import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        input.useLocale(Locale.US);


        System.out.println("Please enter radius");

        double radius= input.nextDouble();

        double PI=3.14F;

        double perimeter=2*radius*PI;

        double area=radius*radius*PI;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

        input.close();










    }
}
