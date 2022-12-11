package day12_Scanner;

import java.util.Scanner;

public class CappucinoBuyer_Nested_If_With_Equals {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("please enter the size you want");

        String size = input.nextLine()  ;

        double price = 2;
        double calorie = 30;

        if (size.equals("tall" )|| size.equals("grante") || size.equals("venti") ){

            if (size == "tall") {
                price = 3.69;
                calorie = 90;
            }else if(size == "grante"){
                price = 3.99;
                calorie = 120;
            }else{
                price = 4.29;
                calorie = 150;


            }
            System.out.println("size ="+size+"\nprice= $"+price+"\ncalorie= " + calorie);



        }else{
            System.out.println("invalid size");

        }


















    }
}



