package utilities;

import java.util.Arrays;

public class StringUtility {

    //print each char of the given string
    public static void printEachChar(String str){

        for (int i = 0; i <str.length() ; i++) {

            System.out.println(str.charAt(i));

        }




    }



    //checks if the given string is anagram, returns boolean
    public static boolean isAnagram (String str1, String str2){

        str1= str1.toLowerCase();
        str2= str2.toLowerCase();

        boolean result = false;

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);


        }


        //removes the dublicates from any given string
    public static String removeDublicates(String str){


        String result = "";

        for (int i = 0; i < str.length(); i++) {

            String ch = ""+str.charAt(i);

            if(!(result.contains(ch))){
                result+=ch;
            }


        }

        return result;


    }


    //check if the given string is palimdrome or not, returns boolean
    public static boolean isPalindrome (String str){

        str = str.toLowerCase();

        String check = "";
        boolean result = false;

        for (int i = 0; i < str.length(); i++) {

            check = str.charAt(i)+check;

        }
        if(check.equals(str)){
            result = true;

        }
        return result;



    }










    }


