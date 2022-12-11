package day33_Statics;

public class Iphone {

    public String model, color;
    public double price, size;

    public static String brand, OS, madeIn;

    public Iphone(String model, String color, double price, double size) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.size = size;
    }

    public void faceTime(long phoneNumber){
        System.out.println("phoneNumber for face time = " + phoneNumber);
    }
    public void faceTime(String email){
        System.out.println("email for facetime = "+email);
    }
    public void call(long phoneNumber){
        System.out.println("phone number for calling = "+phoneNumber);

    }
    public void text ( long phoneNumber){
        System.out.println("phone number to text = "+phoneNumber);
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
