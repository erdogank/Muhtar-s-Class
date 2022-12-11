package day14_String_Methods;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        System.out.println("Welcome to the Cydeo car insurance!");

        //WRITE YOUR CODE BELOW
        double premium=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your full name ");
        String name= input.nextLine();
        System.out.println("Do you have a US driver license?");
        String licenceinfo= input.next();
        if(licenceinfo.equals("yes")){
            System.out.println("Enter your zip code");
            int zipcode= input.nextInt();
            if(zipcode==20910||zipcode==20470||zipcode==20740){
                premium+=60;

            }else if(zipcode==22102||zipcode==22103){
                premium+=30;
            }else{
                premium+=50;
            }
            System.out.println("Is this vehicle owned, financed, or leased?");
            String ownership= input.next();
           switch(ownership){
               case "owned":
                   premium+=10;
                   break;
               case "financed":
                   premium+=15;
                   break;
               case "leased" :
                   premium+=20;
                   break;
           }
            System.out.println("How is this vehicle primarily used?");
           String userInfo= input.next();
           switch(userInfo){
               case "business":
                   premium+=50;
                   break;
               case "pleasure":
                   premium+=10;
                   break;
               case "commuting" :
                   premium+=20;
                   break;

           }
            System.out.println("How old are you?");
           int age= input.nextInt();
           if(age>=16&&age<20){
               premium*=10;
           }else if(age>=20&&age<25){
               premium*=6;

           }else if(age>25){
               premium*=2;
           }
           System.out.println("Have you had any accidents in the last 5 years?");
           String accidenInfo= input.next();
           if(accidenInfo.equals("yes")||accidenInfo.equals("YES")){
               System.out.println("How many?");
               int accidentnumber= input.nextInt();
               premium=premium+(10*accidentnumber);

           }
            System.out.println("What is the highest level of education you have completed?");
           String educationLevel= input.next();
           switch(educationLevel){

               case "Bachelors":
                   premium=premium-((premium/100)*5);
                   break;
               case "Masters":
                   premium=premium-((premium/100)*5);
                   break;
               case "PHD" :
                   premium=premium-((premium/100)*10);
                   break;
               case "High School" :
                   premium=premium+((premium/100)*5);
                   break;

           }
           name=""+name.toLowerCase().toUpperCase().charAt(0)+name.substring(1).toUpperCase().charAt(name.indexOf(""))+name.substring(name.indexOf(" "));



            System.out.println(name+", here's your quote!");
            System.out.println("This is your start premium cost: $"+premium);










        }else{
            System.out.println("You must have a license to get insurance!");
        }


    }
}