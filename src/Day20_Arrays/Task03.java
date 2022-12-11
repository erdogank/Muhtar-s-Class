package Day20_Arrays;

import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        int indexOfGloves = items[2].indexOf("Gloves");
        System.out.println(indexOfGloves);

        String report="";

        for (int i = 0; i < items.length; i++) {
            report="";

            report+= items[i]+" - "+prices[i]+" - #"+itemIDs[i];
            System.out.println(report);
        }

        System.out.println("***************************");

        for (int i = 0; i < items.length ; i++) {

            String ifiPad=items[i];

            if(ifiPad.toLowerCase().equals("ipad")){
                System.out.println("there is iPad in the list");
            }

        }



        }








    }

