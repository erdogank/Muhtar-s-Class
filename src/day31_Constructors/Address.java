package day31_Constructors;

public class Address {

    public int buildingNumber, zipCode;
    public String street, city, state;

    public Address(int buildingNumber, int zipCode, String street, String city, String state) {
        this.buildingNumber = buildingNumber;
        this.zipCode = zipCode;
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public String toString() {
        return "Address{" +
                "buildingNumber=" + buildingNumber +
                ", zipCode=" + zipCode +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public void address(){

        System.out.println(buildingNumber+" "+street+"\n"+city+" "+state+", "+zipCode);
    }
}
