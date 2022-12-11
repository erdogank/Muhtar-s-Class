package day35_Encapsulation.Rectangle;

public class RectangleObjects {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(5,8);

        System.out.println(rectangle1);

        System.out.println(rectangle1.getLength());

        rectangle1.setWidth(0);
        System.out.println(rectangle1);


    }
}
