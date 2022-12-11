package day12_Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Enter your code here

        Scanner scan=new Scanner(System.in);

        System.out.println("Welcome to the patient portal!\nPlease enter your personal information\nEnter your first name");
        String firstName=scan.nextLine();

        System.out.println("Enter your last name");
        String lastName=scan.nextLine();

        System.out.println("Enter your email");
        String email = scan.next();

        scan.nextLine();

        System.out.println("Enter your street");
        String street = scan.nextLine();

        // continue for city
        System.out.println("Enter your city");
        String city = scan.nextLine();

        System.out.println("Enter your state");
        String state = scan.nextLine();

        System.out.println("Enter your zip code");
        int zipCode= scan.nextInt();

        System.out.println("Enter your work phone number");
        long workPhoneNumber= scan.nextLong();

        System.out.println("Enter your personal phone number");
        long personalPhoneNumber= scan.nextLong();

        System.out.println("Enter your age");
        int age= scan.nextInt();


        System.out.println("Enter your height");
        double height= scan.nextDouble();


        System.out.println("Enter your weight");
        double weight= scan.nextDouble();


        System.out.println("Are you married");
        boolean isMarried= scan.nextBoolean();

        System.out.println("Patient personal information");
        System.out.println("Full name: "+firstName+" "+lastName);
        System.out.println("Address: "+street+", " +city+", "+state+" "+zipCode);
        System.out.println("Contact: work phone number: "+workPhoneNumber+", personal phone number: "+personalPhoneNumber
        +", email: "+email);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weight);
        System.out.println("Married: "+isMarried);


    }
}


