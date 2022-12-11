package day22_MultiDimensionalArrays;

public class Task02_01 {

    public static void main(String[] args) {


        String[][] items = {                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}        };

        for (String[] each : items) {
            for (String elements : each) {

                System.out.print(elements+"\t");

            }
            System.out.println();

        }






    }
}
