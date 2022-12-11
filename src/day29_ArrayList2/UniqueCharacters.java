package day29_ArrayList2;

import java.util.*;

public class UniqueCharacters {


    public static void main(String[] args) {

        String str = "aaabcccdeeefgggggggghiiiiiiiiijkkkkkkkkkl";

        String[] arr = str.split("");

        ArrayList<String> list = new ArrayList<>( Arrays.asList(arr) );

        System.out.println("list = " + list);

        String unique = "";

        ArrayList<String> listunique = new ArrayList<>();

        for (String each : list) {

            int frequency =  Collections.frequency(list, each);
            if(frequency == 1){
                unique += each+" ";
                listunique.add(each);
            }

        }


        System.out.println("unique = " + unique);
        System.out.println(listunique);

    }

}