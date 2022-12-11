package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class WarmUp2 {

    public static void main(String[] args) {


        String str= "I love Java";

        String[] strarr = str.split(" ");

        String strsecond = strarr[1];

        String result= "";

        for (int i = strsecond.length()-1; i >=0 ; i--) {

            result+=strsecond.charAt(i);
        }

        str=str.replace(strsecond,result);

        System.out.println(str);



    }
}
