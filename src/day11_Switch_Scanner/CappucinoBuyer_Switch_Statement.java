package day11_Switch_Scanner;

public class CappucinoBuyer_Switch_Statement {

    public static void main(String[] args) {

        String size = "venti";
        double price = 2;
        double calorie = 30;

        switch(size){

            case "tall":
                price = 3.69;
                calorie = 90;
                System.out.println("size ="+size+"\nprice= $"+price+"\ncalorie= " + calorie);
                break;
            case "venti":
                price = 3.99;
                calorie = 120;
                System.out.println("size ="+size+"\nprice= $"+price+"\ncalorie= " + calorie);
                break;
            case "grande":
                price = 4.29;
                calorie = 150;
                System.out.println("size ="+size+"\nprice= $"+price+"\ncalorie= " + calorie);
                break;
            default:
                System.out.println("invalid size");
                break;
        }

    }
}
