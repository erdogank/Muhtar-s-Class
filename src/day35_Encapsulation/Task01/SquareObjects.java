package day35_Encapsulation.Task01;

public class SquareObjects {

    public static void main(String[] args) {


        Square square1 = new Square(2.2);

        System.out.println(square1);

        square1.setSide(2);
        System.out.println(square1);

        System.out.println(square1.getSide());

        square1.setSide(-25);
        System.out.println(square1);


    }
}
