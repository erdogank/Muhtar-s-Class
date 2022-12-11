package day36_Inheritance.phone;

public class PhoneObjects {
    public static void main(String[] args) {

        Iphone iphone1 = new Iphone();
        iphone1.setInfo("Apple","Iphone 11","black",6,700);

        Nokia nokia1 = new Nokia();
        nokia1.setInfo("Nokia", "8310","gray",4,100);

        Samsung samsung1 = new Samsung();
        samsung1.setInfo("Samsung", "Note 10", "Blue",6,550);

        samsung1.freeze();





    }
}




