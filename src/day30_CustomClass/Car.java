package day30_CustomClass;

public class Car {

    public String brand;
    public String model;
    public String color;
    public int year;
    public double price;

    public void setInfo(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
    }

    /*public void setInfo(String carBrand, String carModel, String carColor, int carYear, double carPrice){
        brand = carBrand;
        model= carModel;
        color = carColor;
        year = carYear;
        price = carPrice;

    }*/

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }

    public void start(){

        System.out.println("brand = " + brand+" "+model+" has started.");

    }

    public void drive(){
        System.out.println("brand+\" \"+model+\" is driving.\" = " + brand+" "+model+" is driving.");

    }

    public void stop(){
        System.out.println("brand = " + brand+ " "+ model+ " has stopped.");

    }
}
