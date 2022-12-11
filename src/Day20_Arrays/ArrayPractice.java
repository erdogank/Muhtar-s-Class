package Day20_Arrays;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        char[] letters = new char[26];

        /*for (char i = 'z', j=0 ;    i <='z'&&j<=26 ;         i--, j++){
            letters[j]=i;        }
        System.out.println(Arrays.toString(letters));              OR:

         */

        char ch = 'z';

        for (int i = 25; i >= 0; i--) {                //ch-- can be inside the paranthesis here;
            letters[i] = ch;
            ch--;

        }
        System.out.println(Arrays.toString(letters));

        char[] letters2 = new char[26];

        for (char i = 'z', j = 0; i <= 'z' && j < 26; i--, j++) {
            letters2[j] = i;
        }
        System.out.println(Arrays.toString(letters2));

        //letters2[0]=88; //88='X' Ascıı table
        //System.out.println(Arrays.toString(letters2));






    }

}
