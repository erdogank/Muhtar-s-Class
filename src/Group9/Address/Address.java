package Group9.Address;

public class Address {

    private String street, city, state, country;
    private int zipcode;

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public int getZipcode() {
        return zipcode;
    }


    public void setStreet(String street) {

        if(street.length()>50||street.equals(""))
            System.err.println("ERROR: Invalid Street");
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setZipcode(int zipcode) {
        if(Integer.toString(zipcode).length()!=5) {
            System.err.println("ERROR: Invalid ZipCode");
            System.exit(1);

        }

        this.zipcode = zipcode;
    }

    public Address(String street, String city, String state, String country, int zipcode) {
        setStreet(street);
        setCity(city);
        setState(state);
        setCountry(country);
        setZipcode(zipcode);
    }

    public Address (){}

    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipcode=" + zipcode +
                '}';
    }
}
