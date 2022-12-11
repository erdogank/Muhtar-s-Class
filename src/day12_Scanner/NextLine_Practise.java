package day12_Scanner;

import java.util.Scanner;

public class NextLine_Practise {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your age");

        short age = scan.nextShort();


        System.out.println("Please enter your full name");
        
        scan.nextLine();

        String name= scan.nextLine();
        
        System.out.println("\nyou are "+age+" years old and your name is "+name);

        System.out.println("Please enter yout GPA");

        double gpa =scan.nextDouble();

        System.out.println("Please enter your school name");

        scan.nextLine();
        
        String schoolname= scan.nextLine();

        System.out.println("schoolname = " + schoolname+"gpa = "+gpa);

        scan.close();

       









    }
}
