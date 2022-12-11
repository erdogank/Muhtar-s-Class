package Group9.adamTask01;

public class Person {
    private String firstName = "undefined";
    private String lastname = "undefined";
    private int age = -1;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return firstName + " | " + lastname + " | " +age ;
    }

    public Person(String firstName, String lastname, int age) {
        setFirstName(firstName);
        setLastname(lastname);
        setAge(age);
    }

    public Person(){}

}
