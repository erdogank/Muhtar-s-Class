package day02_HelloWorld;

import utilities.ArraysUtility;
import utilities.StringUtility;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {


        String str1 = "level";
        String str2 = "velel";

        boolean isAnagram = StringUtility.isAnagram(str1,str2);
        System.out.println(isAnagram);


        String str3 = "aaabbbcccdde";

        String str4 = StringUtility.removeDuplicates(str3);
        System.out.println(str4);

        String str5 = "Racecar";
        boolean result = StringUtility.isPalindrome(str5);
        System.out.println(result);

        String str6 = "fenerbahçe";
        StringUtility.printEachChar(str6);

        int[] numarr = {1,2,3,4,5};

        ArraysUtility.printEach(numarr);

        System.out.println("*****************************");



        int n = 5361, step = 0;

        while(n > 0){

            n /= 10;

            step++;

        }
        System.out.println(step);

        int number8 = (int)Math.pow(9,2);
        System.out.println(number8);

        String[] arrnmames = {"ayse", "kerem","yasemin"};
        String name= "seval, erdoğan";

       arrnmames = ArraysUtility.addElement(arrnmames,name);

        System.out.println(Arrays.toString(arrnmames));

        int[] arrnums = {1,2,3,2,4,6,5,3,1,5} ;
        int numtoadd = 5;

        arrnums = ArraysUtility.addElement(arrnums,numtoadd);
        System.out.println(Arrays.toString(arrnums));

        int count = ArraysUtility.frequencyOfElement(arrnums,numtoadd);
        System.out.println(count);

        int[] unnum = ArraysUtility.uniqueElements(arrnums);

        System.out.println(Arrays.toString(unnum));


        String[] strarr1 = {"ayşe", "kerem", "yasemin"};
        String[] strarr2 = {"seval", "erdogan"};

        String[] family = ArraysUtility.merge2Arrays(strarr1, strarr2);
        System.out.println(Arrays.toString(family));


        int[] arr5 = {1,2,3,4,5,6,7};
        int index = 4;
        int[] removed = ArraysUtility.removeElement(arr5,index);
        System.out.println(Arrays.toString(removed));

        int[] reversed = ArraysUtility.reverseArray(arr5);
        System.out.println(Arrays.toString(reversed));





    }
}
