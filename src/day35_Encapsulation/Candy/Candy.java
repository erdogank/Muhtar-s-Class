package day35_Encapsulation.Candy;

public class Candy {
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanut;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity < 0){
            System.out.println("invalid entry");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<0){
            System.err.println("wrong value of price");
            System.exit(1);
        }

        this.price = price;
    }

    public boolean isHasPeanut() {
        return hasPeanut;
    }

    public void setHasPeanut(boolean hasPeanut) {
        this.hasPeanut = hasPeanut;
    }

    public Candy(String brand, int quantity, double price, boolean hasPeanut) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanut(hasPeanut);
    }



    public String toString() {



            return "Candy{" +
                    "brand='" + brand + '\'' +
                    ", quantity=" + quantity +
                    ", price=" + ((price==0)? "free":price) +
                    ", hasPeanut=" + hasPeanut +
                    '}';
        }
    }

