package day37_Inheritance.phone;

public class Samsung extends Phone {


    public Samsung(String model, String color, double size, double price) {
        super("Samsung", model, color, size, price);
    }

    public void freeze(){
        System.out.println(model+" is freezing");
    }
}
