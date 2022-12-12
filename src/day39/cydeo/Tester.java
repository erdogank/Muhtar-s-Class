package day39.cydeo;

public class Tester extends Employee {

    public Tester(String name, char gender, int age, int employeeId, double salary) {
        super(name, gender, age, employeeId, "Tester", salary);
    }

    public void work(){
        System.out.println(getName()+ " is testing user stories");
    }
    public void createTicket(){
        System.out.println(getName()+ " is creating ticket");
    }
}
