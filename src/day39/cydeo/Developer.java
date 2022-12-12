package day39.cydeo;

public class Developer extends Employee{

    public Developer(String name, char gender, int age, int employeeId, double salary) {
        super(name, gender, age, employeeId, "Developer", salary);
    }

    public void work(){
        System.out.println(getName()+ " is coding");
    }
    public void fixBugs(){
        System.out.println(getName()+" is fixing a bug");
    }
}
