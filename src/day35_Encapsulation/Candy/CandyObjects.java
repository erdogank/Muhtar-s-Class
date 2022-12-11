package day35_Encapsulation.Candy;

public class CandyObjects {
    public static void main(String[] args) {

        Candy candy1 = new Candy("kent",2,0,false);

        System.out.println(candy1);
        candy1.setPrice(1);
        System.out.println(candy1);
    }
}
