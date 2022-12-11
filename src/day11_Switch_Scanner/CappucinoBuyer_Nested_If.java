package day11_Switch_Scanner;

public class CappucinoBuyer_Nested_If {

    public static void main(String[] args) {
        String size = "venti";
        double price = 2;
        double calorie = 30;

        if (size == "tall" || size == "grante" || size == "venti"){

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

