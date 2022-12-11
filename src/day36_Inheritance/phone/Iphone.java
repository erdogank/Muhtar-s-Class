package day36_Inheritance.phone;

public class Iphone extends Phone {

    public void facetime(long phoneNumber){
        System.out.println("phone is making facetime connection with" + phoneNumber);
    }
    public void facetime(String email){
        System.out.println("phone is making facetime connection with " + email);
    }


}
