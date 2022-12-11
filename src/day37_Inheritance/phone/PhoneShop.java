package day37_Inheritance.phone;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone1 = new Iphone("Iphone 12","Purple",6.1,720);

        Samsung samsung1 = new Samsung("Note 10","Gray",6.3,550);

        Nokia nokia1 = new Nokia("8310","White",4,250);


        System.out.println(iphone1);

        samsung1.freeze();

        //samsung1.selfDefence();

        iphone1.faceTime("email@mail.com");


    }
}
