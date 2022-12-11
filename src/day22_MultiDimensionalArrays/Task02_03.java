package day22_MultiDimensionalArrays;

public class Task02_03 {

    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        for (int i = items.length-1; i >=0; i--) {

            for (int j = 0; j <items[i].length ; j++) {

                System.out.print(items[i][j]+"\t\t");

            }
            System.out.println();

        }







    }
}
