package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("Toyota", "Corolla", "White", 2016, 20000);




        System.out.println(car1);


        Car car2 = new Car();
        car2.setInfo("Ford", "Focus", "Gray", 2010,10000);

        System.out.println(car2);


        Car car3 = new Car();
        car3.setInfo("Audi", "Q7", "Black", 2019, 40000);
        System.out.println(car3);

        //Car[] cars = {car1, car2, car3};

        ArrayList<Car> carsList = new ArrayList<>(Arrays.asList(car1, car2, car3));
        System.out.println(carsList);
        System.out.println();

        for (Car each : carsList) {
            System.out.println(each.model+ " : "+each.price);

            System.out.println("*****************************");

            /*
            Recall
            BMW: 2005-2008
            toyota: 1995-1997
             */

            carsList.removeIf(p-> p.brand.equals("BMW") && p.year>=2005&&p.year<=2008);

        }

    }










}
