package day38_EncapsulationRecap.animal;



public class Tiger extends Animal{

    public Tiger(String name, String breed, String color, int age, char gender, char size) {
        super(name, breed, color, age, gender, size);
    }

    public void eat(){

        System.out.println(name+ " is eating deer");
    }

    public static void main(String[] args) {

        Tiger tiger1 = new Tiger("Kaplan","Nepalese","Yellow",5,'M','L');

        tiger1.eat();
        System.out.println(tiger1);



    }
}
