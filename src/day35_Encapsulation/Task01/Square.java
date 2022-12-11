package day35_Encapsulation.Task01;

public class Square {

    private double side;


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side>0) {
            this.side = side;
        }else {
            System.err.println("side value can not be smaller then 0");
            System.exit(0);
        }
    }

    public Square(double side) {
        setSide(side);
    }

    public double calcArea(double side){
        return side*side;
    }

    public double calcPerimeter(double side){
        return side*4;

    }

    public String toString() {
        return "Square{" +
                "side=" + side +
                " perimeter=" + calcPerimeter(side) +
                " area=" + calcArea(side) +
                '}';
    }
}
