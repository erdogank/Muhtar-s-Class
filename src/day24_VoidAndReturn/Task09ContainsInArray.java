package day24_VoidAndReturn;

public class Task09ContainsInArray {

    public static void main(String[] args) {

        boolean result = containsInArray(new int[]{1, 2, 3, 4, 5, 6, 7},13);

        System.out.println(result);

    }

    public static boolean containsInArray(int[] arr, int num){

        boolean ifcontains = false;

        for (int each : arr) {

            if (num==each){

                ifcontains=true;
            }

        }

        return ifcontains;









    }






}
