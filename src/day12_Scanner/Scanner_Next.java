package day12_Scanner;

import java.util.Scanner;

public class Scanner_Next {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("please enter your name");
        String name= input.next();
        System.out.println("name = " + name);
        input.close();
    }
}
