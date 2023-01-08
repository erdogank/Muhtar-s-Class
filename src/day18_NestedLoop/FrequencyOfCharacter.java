package day18_NestedLoop;

import java.util.Scanner;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = input.next();


        int frequency = 0;
        String result="";

        while(!(str.length()==0)) {
            char ch = str.charAt(0);
            String chs =ch+"";


        for (int j = 0; j < str.length() ; j++) {
            char eachChar = str.charAt(j);

            if(ch == eachChar) {

                frequency += 1;
            }

            }result+=chs+frequency;

            frequency=0;

            str=str.replace(chs,"");


        }
        System.out.println("result = " + result);



    }


}









