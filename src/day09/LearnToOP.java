package day09;

import java.util.Scanner;

public class LearnToOP {

    public static void main(String[] args) {
        /*





         */



        String device, a = "Mac", b = "Lenova", c = "Iphone", d = "Samsung";

        Scanner scan = new Scanner(System.in);

        System.out.println("Write your device name (Mac,Lenova,Iphone,Samsung):");
        device = scan.nextLine();

        if (device.equals(a)) {
            System.out.print("MacOS");
        }else if (device.equals(b)) {
            System.out.print("Windows");
        }else if (device.equals(c)) {
            System.out.print("IOS");
        }else if (device.equals(d)) {
            System.out.print("Android");
        }else {
            System.out.println("You entered an invalid device.");
        }
    }



}