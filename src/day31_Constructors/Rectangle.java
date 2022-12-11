package day31_Constructors;

public class Rectangle {

    public double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + areaOfRectanglure(length,width) +
                ", perimeter=" + perimeterOfRectanglure(length, width) +
                '}';
    }

    public double areaOfRectanglure(double length, double width){
        return length*width;

    }

    public double perimeterOfRectanglure(double length, double width){
        return (length+width)*2;

    }
}
