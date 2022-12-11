package day22_MultiDimensionalArrays;

public class Task02_02 {

    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };


        for (int i = 0; i < items.length; i++) {

            for (int j = items[i].length-1; j >=0 ; j--) {

                System.out.print(items[i][j]+ "\t");

            }
            System.out.println();

        }









    }
}
