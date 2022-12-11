package day12_Scanner;


import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println( "please enter your full name");
        String name= input.nextLine();

        System.out.println("please enter your building number");
        int bnumber= input.nextInt();

        System.out.println("please enter your street name");
        input.nextLine();
        String sname= input.nextLine();

        System.out.println("Enter your city name");
        String city= input.nextLine();

        System.out.println("please enter your state name");
        String state = input.nextLine();

        System.out.println("please enter your zipcode");
        int zipcode= input.nextInt();

        System.out.println("Address: \n"+name+"\n"+bnumber+" "+sname+" street \n"+city+"/"+state+"\n"+zipcode);

        input.close();




    }
}
