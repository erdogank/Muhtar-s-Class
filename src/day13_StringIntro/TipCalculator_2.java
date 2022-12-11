package day13_StringIntro;

import java.util.Scanner;

public class TipCalculator_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of people");
        int numberOfPeople = input.nextInt();

        System.out.println("split or no split(Yes or No)");
        String yesOrNo = input.next();

        System.out.println("enter the check amount");
        double checkAmount = input.nextDouble();

        System.out.println("How was the service quality(Excellent/Great/Good/Fair/Poor)");
        String serviceQuality = input.next();

        double tipPercent = 0.05;
        double tip = checkAmount * tipPercent;

        double tipPerPerson = tip / numberOfPeople;
        double totalPerPerson = checkAmount / numberOfPeople;


        if(yesOrNo.equals("yes")){

            switch(serviceQuality){
                case "Excellent":
                    tipPercent=0.25;
                    break;

                case "Great":
                    tipPercent=0.20;
                    break;

                case "Good":
                    tipPercent=0.15;
                    break;

                case "Fair":
                    tipPercent=0.10;
                    break;

                case "Poor":
                    tipPercent=0.05;
                    break;

            }







        }


    }
}
