package day11_Switch_Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        int number=1;//1 to 7, switch data can not be long, double, float and boolean.

        switch(number){

            case 1:
                System.out.println("monday");
                break;//exits here if it is case 1. if we do not put break statement switch
                      // statement continue to execute the next block without checking.

            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;

            case 5:
                System.out.println("friday");
                break;

            default://we can put default anywhere in the block but we should add break if it is not at the end.
                System.out.println("wrong input");
                break;

            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;






        }











    }
}
