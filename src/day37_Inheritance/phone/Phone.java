package day37_Inheritance.phone;

public class Phone {

    public String brand, model, color;
    public double size, price;

    public static boolean hasBattery;


    public Phone(String brand, String model, String color, double size, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
    } //constructor

    static{
        hasBattery = true;
    } //static block

    public void call(long phoneNumber){
        System.out.println(brand +" "+model+" is calling " + phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(brand +" "+model+" is texting " + phoneNumber);
    }


    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", price= $" + price +
                ", hasBattery=" + hasBattery +
                '}';
    }
}
