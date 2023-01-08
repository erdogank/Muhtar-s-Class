package day18_NestedLoop;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double price=0;

        while(true){

            System.out.println("please enter a room type");
            String roomType= scanner.nextLine().toLowerCase();

            while(!(roomType.equals("single bed")||roomType.equals("queen bed")||roomType.equals("king bed"))){
                System.err.println("invalid entry, please try again!");
                roomType= scanner.nextLine().toLowerCase();
            }
            System.out.println("how many nights you wanna stay");
            int nights = scanner.nextInt();

            if(roomType.equals("single bed")){
                price+=80*nights;
            }
            else if(roomType.equals("queen bed")){
                price+=100*nights;
            }else{
                price+=120*nights;
            }
            System.out.println("would you like to reserve another room?");
            String answer= scanner.next().toLowerCase();
            scanner.nextLine();

            while(!(answer.equals("yes")||answer.equals("no"))) {
                System.err.println("invalid entry, try again!");
                answer=scanner.next();
                scanner.nextLine();


            }

            if(answer.equals("no"))
                break;


            }


            System.out.println("price = " + price);




        }




    }
