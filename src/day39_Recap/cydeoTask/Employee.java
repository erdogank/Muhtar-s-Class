package day39_Recap.cydeoTask;

public class Employee extends Person{

    private int employeeId;
    private String jobTitle;
    private double salary;

    public Employee(String name, char gender, int age, int employeeId, String jobTitle, double salary) {
        super(name, gender, age);
        setEmploeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getEmploeeId() {
        return employeeId;
    }

    public void setEmploeeId(int emploeeId) {

        if(employeeId<0){
            System.out.println("invalid entry");
            System.exit(1);
        }
        this.employeeId = emploeeId;
    }

    public String getJobTitle() {
        if (jobTitle==null){
            System.err.println("you should give a name");
            System.exit(1);
        }
        if(jobTitle.isBlank()||jobTitle.isEmpty()) {
            System.err.println("name can not be empty");
            System.exit(1);
        }
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        if(salary<60000){
            System.out.println("invalid salary");
            System.exit(1);
        }
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){

        System.out.println(getName()+ " is working");

    }

    public String toString() {
        return "Employee{" +
                "name=" + getName() +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", employeeId=" + employeeId +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
