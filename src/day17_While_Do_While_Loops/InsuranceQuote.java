package day17_While_Do_While_Loops;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {

        double price=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your name");
        String name= scan.nextLine();

        System.out.println("please enter your gender! M or F");
        String gender= scan.next();
        while(!(gender.equalsIgnoreCase("M")||gender.equalsIgnoreCase("F"))){
            System.out.println("invalid entry please enter M or F");
            gender= scan.next();
        }
        System.out.println("Are you married? yes or no please.");
        String isMarried= scan.next();
        while(!(isMarried.equalsIgnoreCase("yes")||isMarried.equalsIgnoreCase("no")) ){
            System.out.println("invalid entry. yes or no please");
            isMarried= scan.next();
        }
        System.out.println("please enter your age");
        int age= scan.nextInt();
        while(!(age>0&&age<120)){
            System.out.println("please enter your age correctly");
            age= scan.nextInt();
        }
        System.out.println("how many miles do you drives in a day");
        int milePerDay= scan.nextInt();
        while(!(milePerDay>5)){
            System.out.println("please enter your mileage per day");
            milePerDay= scan.nextInt();
        }
        System.out.println("do you want full coverage or liability insurance");
        scan.nextLine();
        String coverageType= scan.nextLine();
        System.out.println("Did you have an accident or claims in the past 5 years? yes or no");
        String accidentInfo= scan.next();
        while(!(accidentInfo.equalsIgnoreCase("yes")||accidentInfo.equalsIgnoreCase("no"))){
            System.out.println("invalid entry. please enter yes or no");
            accidentInfo= scan.next();
        }
        System.out.println("do you have anti-theft device in your car? yes or no?");
        String deviceInfo= scan.next();
        while(!(deviceInfo.equalsIgnoreCase("yes")||deviceInfo.equalsIgnoreCase("no"))){
            System.out.println("invalid entry. please yes or no?");
            deviceInfo= scan.next();
        }
        if(coverageType.equalsIgnoreCase("liability insurance")){
            if(age<25){
                price+=90;

            }else if(age>=25){
                price+=50;
            }
            if(milePerDay<=10){
                price+=10;
            }else if(milePerDay>10&&milePerDay<=50){
                price+=30;
            }else if(milePerDay>50){
                price+=50;
            }
        }
        if(coverageType.equalsIgnoreCase("full coverage")) {
            if (age < 25) {
                price += 160;

            } else if (age >= 25) {
                price += 120;
            }
            if (milePerDay <= 10) {
                price += 20;
            } else if (milePerDay > 10 && milePerDay <= 50) {
                price += 40;
            } else if (milePerDay > 50) {
                price += 70;
            }
        }
        if(deviceInfo.equalsIgnoreCase("yes")){
            price=price*1.05;
        }if(accidentInfo.equalsIgnoreCase("no")){
            price=price*1.10;
        }if(isMarried.equalsIgnoreCase("yes")){
            price=price*1.05;
        }
        System.out.println("price = " + price);
    }
}
