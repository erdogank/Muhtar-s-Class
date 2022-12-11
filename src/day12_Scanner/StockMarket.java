package day12_Scanner;

import java.util.Scanner;

public class StockMarket {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("how many total share you have currently?");
        int totalNumber= input.nextInt();

        System.out.println("Please enter value of your shares in stock market");
        double totalValue= input.nextDouble();

        System.out.println("Please enter the name of the company you have the most shares");
        input.nextLine();
        String companyName= input.nextLine();

        System.out.println("Your total stock market holding is $"+totalValue+" which is made up of "+totalNumber+" shares. "+companyName+" is your company holdings");

input.close();

    }
}
