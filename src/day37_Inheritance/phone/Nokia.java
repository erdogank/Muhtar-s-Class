package day37_Inheritance.phone;

public class Nokia extends Phone{

    public Nokia(String model, String color, double size, double price) {
        super("Nokia", model, color, size, price);
    }

    public void selfDefence(){

        System.out.println(model +" can be used for seld defence");
    }
}
