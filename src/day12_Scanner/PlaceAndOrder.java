package day12_Scanner;

import java.util.Scanner;

public class PlaceAndOrder {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your order");

        String order= input.nextLine();

        System.out.println("Please enter the price");

        double price= input.nextDouble();

        System.out.println("Please enter the quantity");

        int quantity= input.nextInt();
        double totalPrice=quantity*price;

        String s="";
        if(quantity>1){
            s="s";
        }else{
            s="";
        }

        System.out.println("Please enter your name");

        String name= input.next();

        System.out.println(name+", your order for "+quantity+" "+order+s+" has been placed.\nYour total is "+"$"+totalPrice);

        input.close();

    }
}
