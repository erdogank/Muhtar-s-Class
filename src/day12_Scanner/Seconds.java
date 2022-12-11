package day12_Scanner;

import java.util.Scanner;

public class Seconds   {public static void main(String[] args) {
    //WRITE YOUR CODE BELOW:


    Scanner scan = new Scanner(System.in);

    System.out.println("Enter seconds:");
    int inputSeconds = scan.nextInt();

    int hours=inputSeconds/3600;
    int minutes=(inputSeconds-hours*3600)/60;
    int seconds=inputSeconds%60;

    System.out.print( hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");

    scan.close();


}
}

