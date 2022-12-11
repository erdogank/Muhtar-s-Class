package day12_Scanner;

import java.util.Scanner;

public class HowManyPeople {

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        System.out.println("Enter the number of people you live with");

        int peopleNumber = input.nextInt();

        if (peopleNumber>=1){

            switch(peopleNumber){

                case 1: case 2:
                    System.out.println("Live with less than 3 people");
                    break;
                case 3: case 4: case 5: case 6:
                    System.out.println("Live with 3 - 6 people");
                    break;
                default:
                    System.out.println("Live with more then 6 people");
                    break;

            }
        }else{
            System.out.println("please enter a valid number");
        }












    }
}
