package day39_Recap.cydeoTask;

public class Teacher extends Employee{
    public Teacher(String name, char gender, int age, int employeeId, double salary) {
        super(name, gender, age, employeeId, "Teacher", salary);
    }

    public void work(){
        System.out.println(getName()+" is in the class now");
    }
}
