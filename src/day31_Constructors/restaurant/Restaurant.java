package day31_Constructors.restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public String owner, Location;
    public int numberOfStars;
    public ArrayList<Server> servers = new ArrayList<>();
    public ArrayList<Chef> chefs = new ArrayList<>();


    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        Location = location;
        this.numberOfStars = numberOfStars;
    }


    public void hireServer(Server server){
        servers.add(server);

    }
    public void hireServers(Server[] serverarr){

        servers.addAll(Arrays.asList(serverarr));

    }

    public void hireChef (Chef chef){
        chefs.add(chef);
    }
    public void hirechefs(Chef[] cheffarr){
        chefs.addAll(Arrays.asList(cheffarr));
    }

    public void terminateServer (int employeeID){
        servers.removeIf(p-> p.employeeID==employeeID);
    }

    public void terminateChef(int employeeID){
        chefs.removeIf(p-> p.employeeID==employeeID);
    }

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", Location='" + Location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", noOFServers=" + servers.size() +
                ", noOfChefs=" + chefs.size() +
                '}';
    }
}
