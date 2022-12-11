package day22_MultiDimensionalArrays;

public class WarmUpReverseSentence {

    public static void main(String[] args) {


        String str = "Today is a good day to learn Java";

        String[] strarr = str.split(" ");

        String reverse = "";

        for (int i = strarr.length-1; i >=0; i--) {

            reverse+=strarr[i]+" ";

        }
        System.out.println(reverse.trim());







    }
}
