package day39.cydeo;

public class Person {

    private String name;
    private char gender;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null){
            System.err.println("you should give a name");
            System.exit(1);
        }
        if(name.isBlank()||name.isEmpty()) {
            System.err.println("name can not be empty");
            System.exit(1);
        }

        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender=='M'||gender=='F')){
            System.out.println("invalid entry");
            System.exit(1);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0 || age>=150){
            System.out.println("invalid age");
            System.exit(1);
        }
        this.age = age;
    }

    public Person(String name, char gender, int age) {
        setName(name);
        setGender(gender);
        setAge(age);
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void drink(){
        System.out.println(name+ " is drinking water");
    }
    public void sleep(){
        System.out.println(name+ " is sleeping");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
