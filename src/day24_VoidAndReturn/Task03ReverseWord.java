package day24_VoidAndReturn;

public class Task03ReverseWord {

    public static void main(String[] args) {

        String reverse = reverseWords("Java");

        System.out.println(reverse);





    }


    public static String reverseWords(String str){

        String result= "";

        for (int i = str.length()-1; i >=0 ; i--) {

            result +=  str.charAt(i);

        }
        return result;




    }









}
