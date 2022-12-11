package Group9.adamTask02;

public class Credentials {
    private String userName = "erdogan";
    private String password = "pass1234";

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public Credentials(String userName, String password, Credentials com1) {
        setUserName(userName);
        setPassword(password);

    }

    public Credentials(){}

    /*
     Create an encapsulated class called Credentials
with attributes username and password,
which are already initialized with some values in the
same Credentials class.
Create another class Login, to set and get values of Credentials class.
     */


}
