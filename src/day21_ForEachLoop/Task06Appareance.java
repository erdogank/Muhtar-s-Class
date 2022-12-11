package day21_ForEachLoop;

import java.util.Arrays;

public class Task06Appareance {
    public static void main(String[] args) {


        String sentence = "I love java. I also love python. But I think I love java more.";

        String[] words = sentence.split(" ");

        int numberOfJava = 0;
        int numberOfPython= 0;

        for (String each : words) {

            if(each.toLowerCase().contains("java")){

                numberOfJava++;
            }
            if(each.toLowerCase().contains("python")){

                numberOfPython++;
            }


        }
        System.out.println("numberOfPython = " + numberOfPython);
        System.out.println("numberOfJava = " + numberOfJava);


    }



}
