package day35_Encapsulation.Pizza;

public class Pizza {

    private char size;
    private int numberOfCheeseToppings, numberOfPepperoniTopics;

    public void setSize(char size) {

        if(!(size == 'M' || size== 'S' || size == 'L')){

            System.err.println("invalid size");
            System.exit(0);
        }
        this.size = size;


    }

    public void setNumberOfCheeseToppings(int numberOfCheeseToppings) {

        if(size == 'S' && numberOfCheeseToppings>3){
            System.out.println("the maximum number of cheese toppings are 3");
            System.exit(0);
        }
        else if(size == 'M' && numberOfCheeseToppings>4){
            System.out.println("the maximum number of cheese toppings are 4");
            System.exit(0);
        }
        else if(size == 'L' && numberOfCheeseToppings>5){
            System.out.println("the maximum number of cheese toppings are 5");
            System.exit(0);
        }

        this.numberOfCheeseToppings = numberOfCheeseToppings;
    }

    public void setNumberOfPepperoniTopics(int numberOfPepperoniTopics) {

        if(size == 'S' && numberOfPepperoniTopics>3){
            System.out.println("the maximum number of peperoni toppings are 3");
            System.exit(0);
        }
        else if(size == 'M' && numberOfPepperoniTopics>4){
            System.out.println("the maximum number of peperoni toppings are 4");
            System.exit(0);
        }
        else if(size == 'L' && numberOfPepperoniTopics>5){
            System.out.println("the maximum number of peperoni toppings are 5");
            System.exit(0);
        }


        this.numberOfPepperoniTopics = numberOfPepperoniTopics;
    }

    public char getSize() {
        return size;
    }

    public int getNumberOfCheeseToppings() {
        return numberOfCheeseToppings;
    }

    public int getNumberOfPepperoniTopics() {
        return numberOfPepperoniTopics;
    }

    public Pizza(char size, int numberOfCheeseToppings, int numberOfPepperoniTopics) {
        setSize(size);
        setNumberOfCheeseToppings(numberOfCheeseToppings);
        setNumberOfPepperoniTopics(numberOfPepperoniTopics);
    }

    public double pizzaCost(){

        double price =0;

        if(size == 'S'){
            price+=10;
        }else if(size=='M'){
            price+=12;
        }else if(size =='L'){
            price+=14;
        }
        price+=getNumberOfCheeseToppings()*2;
        price+=getNumberOfPepperoniTopics()*2;

        return price;


    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseToppings=" + numberOfCheeseToppings +
                ", numberOfPepperoniTopics=" + numberOfPepperoniTopics +
                ", price=" + pizzaCost() +
                '}';
    }
}
