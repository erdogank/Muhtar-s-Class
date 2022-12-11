package day11_Switch_Scanner;

import java.net.SocketOption;
import java.sql.SQLOutput;

public class Elevator {

    public static void main(String[] args) {

        byte floorNumber=1;

        if(floorNumber==1||floorNumber==2||floorNumber==3){

            if(floorNumber==1){
                System.out.println("Floor 1 selected. Companies:Lobby, Verizon, Starbucks");
            }else if(floorNumber==2){
                System.out.println("Floor 2 Selected. Companies: Cybertek, NASA, Intelsat");

            }else{
                System.out.println("Floor 3 Selected. Companies: Lyft, BofA, Stake house");
            }

        }else{
            System.out.println("Invalid Floor");
        }

        System.out.println("****************************");

        switch(floorNumber){

            case 1:
                System.out.println("Floor 1 selected. Companies:Lobby, Verizon, Starbucks");
                break;
            case 2:
                System.out.println("Floor 2 Selected. Companies: Cybertek, NASA, Intelsat");
                break;

            case 3:
                System.out.println("Floor 3 Selected. Companies: Lyft, BofA, Stake house");
                break;
            default:
                System.out.println("Invalid Floor");



        }

        System.out.println("*********************************");


        if(floorNumber==1||floorNumber==2||floorNumber==3){

            switch(floorNumber){
                case 1:
                    System.out.println("Floor 1 selected. Companies:Lobby, Verizon, Starbucks");
                    break;
                case 2:
                    System.out.println("Floor 2 Selected. Companies: Cybertek, NASA, Intelsat");
                    break;
                default:
                    System.out.println("Floor 3 Selected. Companies: Lyft, BofA, Stake house");
            }

        }else{
            System.out.println("ınvalid Floor Number");
        }

    }


}
