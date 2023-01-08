package day18_NestedLoop;

import java.util.Scanner;

public class TriangleWithNestedLoop {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}