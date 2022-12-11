package day31_Constructors.restaurant;

import java.util.ArrayList;

public class LocalRestaurant {

    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("kuzat","Arlington",4);

        Server server1 = new Server("ali",11,25,false);
        Server server2 = new Server("metin",12,30,true);
        Server server3 = new Server("feyyaz",13,25,false);
        Server server4 = new Server("recep",14,25,false);
        Server server5 = new Server("gökhan",15,30,true);

        Server[] serverarr = {server2, server3,server4,server5};

        Chef chef1 = new Chef("engin",21,50,true);
        Chef chef2 = new Chef("hakan",22,50,true);
        Chef chef3 = new Chef("oğuz",23,40,false);
        Chef chef4 = new Chef("rıdvan",24,50,true);
        Chef chef5 = new Chef("aykut",25,40,false);

        Chef[] chefarr = {chef2,chef3, chef4,chef5};

        System.out.println(restaurant1);

        restaurant1.hireServer(server1);
        System.out.println(restaurant1);

        restaurant1.hireServers(serverarr);
        System.out.println(restaurant1);

        restaurant1.hireChef(chef1);
        System.out.println(restaurant1);

        restaurant1.hirechefs(chefarr);
        System.out.println(restaurant1);

        System.out.println(server1);








    }
}
