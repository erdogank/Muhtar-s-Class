package day13_StringIntro;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the number of people");
        int numberOfPeople= input.nextInt();

        System.out.println("split or no split(Yes or No)");
        String yesOrNo= input.next();

        System.out.println("enter the check amount");
        double checkAmount= input.nextDouble();

        System.out.println("How was the service quality(Excellent/Great/Good/Fair/Poor)");
        String serviceQuality= input.next();

        double tipPercent=0.05;
        double tip=checkAmount*tipPercent;

        double tipPerPerson=tip/numberOfPeople;
        double totalPerPerson=checkAmount/numberOfPeople;








        if(serviceQuality.equals("Poor")){
            tipPercent=0.05;
        }else if(serviceQuality.equals("Fair")){
            tip=0.10;
        }else if(serviceQuality.equals("Good")){
            tip=0.15;

        }else if(serviceQuality.equals("Great")){
            tip=0.20;
        }else if(serviceQuality.equals("Excellent")){
            tip=0.25;
        }else{
            System.out.println("invalid input");
        }
        if(yesOrNo.equals("Yes")){
            System.out.println("Number of people entered: "+numberOfPeople+"\nTotal to Pay: "+"\nTotal Tip: "+tip+"\nTotal per person: "+totalPerPerson+"\ntip per person: "+tipPerPerson);

        }else{
            System.out.println("Number of people entered: "+numberOfPeople+"\nTotal to Pay: "+"\nTotal Tip: "+tip);
        }





    }
}
