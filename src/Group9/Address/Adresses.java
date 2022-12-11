package Group9.Address;

public class Adresses {
    public static void main(String[] args) {


        Address home = new Address("South Ball","VA","Arlington","USA",22202);

        System.out.println(home);

        home.setZipcode(220);
        System.out.println(home);

        home.setStreet("");
        System.out.println(home);



    }
}
