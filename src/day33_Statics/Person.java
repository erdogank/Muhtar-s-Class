package day33_Statics;

public class Person {

    public String name;
    public int age;
    public char gender;

    public static boolean isHuman = true;
    public static boolean hasNose;
    public static boolean hasWings;
    public static int numberOfHead;
    public static int numberOfEyes;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public void eat(String food){

        System.out.println(name+ " is eating"+ food);
    }

    public void drink(String beverage){
        System.out.println(name+" + is drinking+ "+beverage);


    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}





