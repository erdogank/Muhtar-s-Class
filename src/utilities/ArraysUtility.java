package utilities;

public class ArraysUtility {

    //prints each integer of an array in seperate lines
    public static void printEach(int[] array) {

        for (int each : array) {

            System.out.println(each);

        }


    }

    //adds the given element to array returns a new array
    public static String[] addElement(String[] arr, String str) {
        String[] added = new String[arr.length + 1];
        int i = 0;

        for (String each : arr) {
            added[i++] = each;
        }
        added[i] = str;
        return added;


    }


    //adds the given element to array returns a new array
    public static int[] addElement(int[] arr, int number) {
        int[] added = new int[arr.length + 1];
        int i = 0;

        for (int each : arr) {
            added[i++] = each;
        }
        added[i] = number;
        return added;


    }

    //adds the given element to array returns a new array
    public static char[] addElement(char[] arr, char number) {
        char[] added = new char[arr.length + 1];
        int i = 0;

        for (char each : arr) {
            added[i++] = each;
        }
        added[i] = number;
        return added;


    }

    //adds the given element to array returns a new array
    public static double[] addElement(double[] arr, double number) {
        double[] added = new double[arr.length + 1];
        int i = 0;

        for (double each : arr) {
            added[i++] = each;
        }
        added[i] = number;
        return added;


    }

    //frequency of an element in an array
    public static int frequencyOfElement(int[] arr, int element) {

        int count = 0;

        for (int each : arr) {

            if (each == element) {
                count++;
            }

        }
        return count;
    }

    //frequency of an element in an array
    public static int frequencyOfElement(double[] arr, double element) {

        int count = 0;

        for (double each : arr) {

            if (each == element) {
                count++;
            }

        }
        return count;
    }

    //frequency of an element in an array
    public static int frequencyOfElement(String[] arr, String element) {

        int count = 0;

        for (String each : arr) {

            if (each.equals(element)) {
                count++;
            }

        }
        return count;
    }

    //frequency of an element in an array
    public static int frequencyOfElement(char[] arr, char element) {

        int count = 0;

        for (char each : arr) {

            if (each == element) {
                count++;
            }

        }
        return count;
    }

    //returns the unique elements to a new array
    public static int[] uniqueElements(int[] arr) {

        int[] result = {};

        for (int each : arr) {

            if (frequencyOfElement(arr, each) == 1) {
                result = addElement(result, each);
            }

        }
        return result;

    }


    //returns the unique elements to a new array
    public static double[] uniqueElements(double[] arr) {

        double[] result = {};

        for (double each : arr) {

            if (frequencyOfElement(arr, each) == 1) {
                result = addElement(result, each);
            }

        }
        return result;


    }

    //returns the unique elements to a new array
    public static String[] uniqueElements(String[] arr) {

        String[] result = {};

        for (String each : arr) {

            if (frequencyOfElement(arr, each) == 1) {
                result = addElement(result, each);
            }

        }
        return result;


    }


    //returns the unique elements to a new array
    public static char[] uniqueElements(char[] arr) {

        char[] result = {};

        for (char each : arr) {

            if (frequencyOfElement(arr, each) == 1) {
                result = addElement(result, each);
            }

        }
        return result;


    }

    //merge two arrays into another array

    public static int[] merge2Arrays(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;

        for (int each : arr1) {

            result[i++] = each;

        }
        for (int each : arr2) {

            result[i++] = each;

        }
        return result;


    }


    //merge two arrays into another array

    public static double[] merge2Arrays(double[] arr1, double[] arr2) {

        double[] result = new double[arr1.length + arr2.length];

        int i = 0;

        for (double each : arr1) {

            result[i++] = each;

        }
        for (double each : arr2) {

            result[i++] = each;

        }
        return result;


    }


    //merge two arrays into another array

    public static String[] merge2Arrays(String[] arr1, String[] arr2) {

        String[] result = new String[arr1.length + arr2.length];

        int i = 0;

        for (String each : arr1) {

            result[i++] = each;

        }
        for (String each : arr2) {

            result[i++] = each;

        }
        return result;


    }



    //merge two arrays into another array

    public static char[] merge2Arrays(char[] arr1, char[] arr2) {

        char[] result = new char[arr1.length + arr2.length];

        int i = 0;

        for (char each : arr1) {

            result[i++] = each;

        }
        for (char each : arr2) {

            result[i++] = each;

        }
        return result;


    }



    public static int[] removeElement (int[] arr, int index){

        int[] result = new int[arr.length-1];

        int i=0;



        for (int j = 0; j < arr.length ; j++) {

            if(j==index)
                continue;

            result[i++] = arr[j];

        }
        return result;




    }

    //removes the index from the array, returns new array
    public static double[] removeElement(double[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        double[] result = new double[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    //removes the index from the array, returns new array
    public static char[] removeElement(char[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        char[] result = new char[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    //removes the index from the array, returns new array
    public static String[] removeElement(String[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        String[] result = new String[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    //reverse the elements in an array

    public static int[] reverseArray(int[] arr){

        int [] reversed = new int[arr.length];

        for (int i = arr.length-1, j= 0; i >= 0 ; i--,j++) {

            reversed[j] = arr[i];

        }
        return reversed;




    }

    //reverse the elements in an array

    public static double[] reverseArray(double[] arr){

        double [] reversed = new double[arr.length];

        for (int i = arr.length-1, j= 0; i >= 0 ; i--,j++) {

            reversed[j] = arr[i];

        }
        return reversed;




    }

    //reverse the elements in an array

    public static char[] reverseArray(char[] arr){

        char [] reversed = new char[arr.length];

        for (int i = arr.length-1, j= 0; i >= 0 ; i--,j++) {

            reversed[j] = arr[i];

        }
        return reversed;




    }

    //reverse the elements in an array

    public static String[] reverseArray(String[] arr){

        String [] reversed = new String[arr.length];

        for (int i = arr.length-1, j= 0; i >= 0 ; i--,j++) {

            reversed[j] = arr[i];

        }
        return reversed;




    }

    //replaces an element given arr with the given index number an element
    public static int[] replaceElementArray(int[] arr, int index, int newElement){
        if(index<0 || index>arr.length-1) {
            System.out.println("invalid index");
            System.exit(0);
        }
        arr[index] = newElement;
        return arr;



    }

    //replaces an element given arr with the given index number an element
    public static double[] replaceElementArray(double[] arr, int index, double newElement){
        if(index<0 || index>arr.length-1) {
            System.out.println("invalid index");
            System.exit(0);
        }
        arr[index] = newElement;
        return arr;



    }

    //replaces an element given arr with the given index number an element
    public static String[] replaceElementArray(String[] arr, int index, String newElement){
        if(index<0 || index>arr.length-1) {
            System.out.println("invalid index");
            System.exit(0);
        }
        arr[index] = newElement;
        return arr;



    }

    //replaces an element given arr with the given index number an element
    public static char[] replaceElementArray(char[] arr, int index, char newElement){
        if(index<0 || index>arr.length-1) {
            System.out.println("invalid index");
            System.exit(0);
        }
        arr[index] = newElement;
        return arr;



    }

    //replace all given element with the element in any given array
    public static int[] replaceAllElements(int[] arr, int oldValue, int newValue){

        for (int i = 0; i <arr.length ; i++) {

            if(arr[i] ==oldValue){
                arr[i] = newValue;
            }
        }
        return arr;


    }

    //replace all given element with the element in any given array
    public static double[] replaceAllElements(double[] arr, double oldValue, double newValue){

        for (int i = 0; i <arr.length ; i++) {

            if(arr[i] ==oldValue){
                arr[i] = newValue;
            }
        }
        return arr;


    }

    //replace all given element with the element in any given array
    public static char[] replaceAllElements(char[] arr, char oldValue, char newValue){

        for (int i = 0; i <arr.length ; i++) {

            if(arr[i] ==oldValue){
                arr[i] = newValue;
            }
        }
        return arr;


    }

    //replace all given element with the element in any given array
    public static String[] replaceAllElements(String[] arr, String oldValue, String newValue){

        for (int i = 0; i <arr.length ; i++) {

            if(arr[i].equals(oldValue)){
                arr[i] = newValue;
            }
        }
        return arr;


    }








}
