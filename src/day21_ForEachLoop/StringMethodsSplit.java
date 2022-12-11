package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethodsSplit {

    public static void main(String[] args) {

        String sentence = "I love java";
        String[] ch = sentence.split(" ");

        System.out.println(Arrays.toString( ch));

        String email ="erdogankalyoncu@gmail.com";

        String[] mail= email.split("@");

        System.out.println(Arrays.toString(mail));

        System.out.println("***********************************");

        String s = "hello. my names is erdogan. how are you.";

        String[] ssplit = s.split("\\.");

        System.out.println(Arrays.toString(ssplit));









    }
}
