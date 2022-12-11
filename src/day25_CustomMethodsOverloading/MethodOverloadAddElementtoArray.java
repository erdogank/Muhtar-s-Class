package day25_CustomMethodsOverloading;

import java.util.Arrays;

public class MethodOverloadAddElementtoArray {
    public static void main(String[] args) {





        String[] names = {"Ali", "Ahmet", "Hüseyin", "Ayşe"};
        String name= "Kerem";

        names =addElementToArray(names,name);

        System.out.println(Arrays.toString(names));

        int[] numbers = {1,2,3,4};
        int number=5;
        numbers = addElementToArray(numbers,number);

        System.out.println(Arrays.toString(numbers));







    }



    public static String[] addElementToArray (String[] arr, String word){

        String[] arrAdded = new String[arr.length+1];

        int i = 0;

        for (String each : arr) {

            arrAdded[i++] = each;

        }arrAdded[i] = word;

        return arrAdded;

    }

    public static int[] addElementToArray (int[] arr, int number){

        int[] arrAdded = new int[arr.length+1];
        int i=0;

        for (int each : arr) {

            arrAdded[i++] = each;

        }arrAdded[i] = number;
        return  arrAdded;










    }




}
