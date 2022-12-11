package day35_Encapsulation.Rectangle;

public class Rectangle {

    private double width, length;

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        if(width<=0) {
            System.err.println("width must be bigger then 0");
            System.exit(0);
        }

        this.width = width;
    }

    public void setLength(double length) {
        if(length<=0) {
            System.err.println("lenngthmust be bigger then 0");
            System.exit(0);
        }

        this.length= width;
    }

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public double area(){

        return width*length;

    }

    public double perimeter(){

        return (width+length)*2;
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
