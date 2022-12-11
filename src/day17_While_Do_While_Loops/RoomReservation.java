package day17_While_Do_While_Loops;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Hello! Would you like to reserve a room?");
        String yesOrNo= scan.next();
        while(!(yesOrNo.equalsIgnoreCase("yes")||yesOrNo.equalsIgnoreCase("no"))){

            System.out.println("please enter a valid entry! yes or no?");
            yesOrNo= scan.next();
        }
        if(yesOrNo.equalsIgnoreCase("yes")){
            System.out.println("Which type of room you want to reserve?");
            System.out.println("King Bed, Queen Bed or Single Bed");
            scan.nextLine();
            String roomType= scan.nextLine();
            while(!(roomType.equalsIgnoreCase("king bed")||roomType.equalsIgnoreCase("Quenn Bed")||roomType.equalsIgnoreCase("single bed"))){
                System.out.println("please enter correct room type");
                roomType= scan.nextLine();
            }
            if(roomType.equalsIgnoreCase("king bed")){
                System.out.println("You selected King Bed and the price will be 120$" );
            }else if(roomType.equalsIgnoreCase("Quenn Bed")){
                System.out.println("you selected Queen Bed and the price will be 100$" );
            }else{
                System.out.println("you selected single Bed and the price will be 80$" );
            }

        }
        else{
            System.out.println("have a nice day");
        }

    }
}
