package Group9.adamTask01;

public class PersonObjects {
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println(person.getFirstName());
        System.out.println(person.getLastname());
        System.out.println(person.getAge());

        person.setFirstName("John");
        person.setLastname("Doe");
        person.setAge(44);

        System.out.println(person.toString() );

        Person person1 = new Person("Fatima", "Lee", 22);
        System.out.println(person1);



    }
}
