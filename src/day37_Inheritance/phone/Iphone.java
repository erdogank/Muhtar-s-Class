package day37_Inheritance.phone;

public class Iphone extends Phone{

    //first we must call the constructer

                //we can remove brand here because all brands od iphone is "Apple"
    public Iphone(String model, String color, double size, double price) {
        super("Apple", model, color, size, price);
    }

    public void faceTime(long phoneNumber){

        System.out.println(model+" has facetime connection with "+phoneNumber );
    }

    public void faceTime(String email){

        System.out.println(model + " has facetime connection with " + email);
    }
}
