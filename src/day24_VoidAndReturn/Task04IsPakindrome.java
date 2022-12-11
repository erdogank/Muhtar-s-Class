package day24_VoidAndReturn;

public class Task04IsPakindrome {

    public static void main(String[] args) {

        boolean result = isPalindrome("leveli");

        System.out.println("result = " + result);



    }

    public static boolean isPalindrome(String word){

        boolean isPalindrome = false;
        String reverse="";

        for (int i = word.length()-1; i >=0 ; i--) {

            reverse+=word.charAt(i);

        }
        if(reverse.equals(word)){
            isPalindrome=true;
        }else{
            isPalindrome=false;
        }




        return isPalindrome;





    }



}
