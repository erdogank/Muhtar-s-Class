package Group9;


public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1024;
        String number = 1024+"";
        String reverse = "";

        for (int i = number.length()-1; i >=0 ; i--) {
            reverse+=number.charAt(i);

        }
        int reversenum = Integer.parseInt(reverse);
        System.out.println(reversenum);

    }
}






