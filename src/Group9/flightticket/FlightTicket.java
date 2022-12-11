package Group9.flightticket;

public class FlightTicket {
    private String type;
    private String departure;
    private String arrival;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if(!(type.equals("first")||type.equals("business")||type.equals("economy"))){
            System.err.println("ERROR: Invalid ticket type");
            System.exit(1);
        }
        this.type = type;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public FlightTicket(String type, String departure, String arrival) {
        setType(type);
        setDeparture(departure);
        setArrival(arrival);
    }

    public String toString() {
        return "FlightTicket{" +
                "type='" + type + '\'' +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                '}';
    }






}