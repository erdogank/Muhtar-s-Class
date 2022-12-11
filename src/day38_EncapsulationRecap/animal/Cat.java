package day38_EncapsulationRecap.animal;

public class Cat extends Animal{

    public Cat(String name, String breed, String color, int age, char gender, char size) {
        super(name, breed, color, age, gender, size);
    }
    public void eat(){
        System.out.println(name+ " is eating cat food");
    }

    public static void main(String[] args) {

        Cat cat1 = new Cat("şeker","Van","Black",2,'M','S');

        cat1.eat();


    }

}
