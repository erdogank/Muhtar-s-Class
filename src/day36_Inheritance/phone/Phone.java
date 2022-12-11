package day36_Inheritance.phone;

public class Phone {

    public String brand, model, color;
    public double size, price;


    public void setInfo(String brand, String model, String color, double size, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public void call(long phoneNumber){
        System.out.println("phone is calling " + phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println("phone is texting " + phoneNumber);
    }


    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
