package day02_HelloWorld;

import java.util.ArrayList;

public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("Hello World"+" "+2+3+4*5+3);

        String str = "ABCD123$%#@&456EFG!";

        char [] charr = str.toCharArray();

        ArrayList<Character> letters = new ArrayList<>();

        for (char each : charr) {

            if(Character.isLetter(each))
                letters.add(each);

        }
        System.out.println(letters);












    }
}

