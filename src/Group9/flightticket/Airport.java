package Group9.flightticket;

import java.util.ArrayList;
import java.util.Arrays;

public class Airport {

    static ArrayList<FlightTicket> ticketlist = new ArrayList<>();
    static{
        FlightTicket ticket1 = new FlightTicket("first","Chicago","Virginia");
        FlightTicket ticket2 = new FlightTicket("business","Washington","Austin");
        FlightTicket ticket3 = new FlightTicket("first","Newark","Miami");
        FlightTicket ticket4 = new FlightTicket("economy","Chicago","Virginia");
        FlightTicket ticket5 = new FlightTicket("economy","NewJersey","Virginia");
        FlightTicket ticket6 = new FlightTicket("business","Las Vegas","NewYork");
        FlightTicket ticket7 = new FlightTicket("first","Chicago","Boston");
        FlightTicket ticket8 = new FlightTicket("economy","Boston","Wyoming");
        FlightTicket ticket9 = new FlightTicket("business","Chicago","Virginia");
        FlightTicket ticket10 = new FlightTicket("first","Virginia","Las Vegas");

        ticketlist.addAll(Arrays.asList(ticket1,ticket2,ticket3,ticket4,ticket5,ticket6,ticket7,ticket8,ticket9,ticket10));

    }


    public static void main(String[] args) {

        System.out.println(ticketlist);

        System.out.println(firstClass(ticketlist));

    }

    public static ArrayList<FlightTicket> firstClass(ArrayList<FlightTicket> list){

        ArrayList<FlightTicket> first = new ArrayList<>();

        for (FlightTicket each : list) {
            if(each.getType().equals("first")){
                first.add(each);
            }

        }
        return first;




    }
}
