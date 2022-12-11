package day35_Encapsulation.StrongPassword;

public class Test {
    public static void main(String[] args) {

        Credentials cr1 = new Credentials("erdi", "QWfghj123@");

        System.out.println(cr1);

        cr1.setPassWord("Qfgh123dg?");


        System.out.println(cr1);
    }

}
