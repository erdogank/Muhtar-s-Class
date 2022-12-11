package day17_While_Do_While_Loops;

import java.util.Scanner;

public class FruquencyOfWordJava_WhileLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String str= scan.nextLine().toLowerCase();
        int fruquency=0;

        while (str.contains("java")){
            str=str.replaceFirst("java","");
            fruquency++;



        }
        System.out.println("fruquency = " + fruquency);
        System.out.println("str = " + str);




    }
}
