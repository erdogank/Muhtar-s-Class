package day33_Statics;

public class Circle {

    public double radius, diameter;
    public static double pi;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calcarea(){

        return radius*radius*pi;
    }

    public double perimeter(){

       return 2*radius*pi;

    }

    public static void displayPi(){
        System.out.println(pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", area=" +calcarea()+
                ", perimeter=" +perimeter()+"," +
                "pi=" +pi+

                '}';
    }
}
