package day17_While_Do_While_Loops;
import java.util.Scanner;

public class Divisible_15_5_3 {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                String divisableBy15 = "";
                String divisableBy5 = "";
                String divisableBy3 = "";

                System.out.println("Enter a number");
                int num = input.nextInt();
                int i = 1;
                while (i <= num) {
                        if (i % 15 == 0) {
                                divisableBy15 += i + " ";
                                i++;                        }

                        i++;


                }
                i = 1;
                while (i <= num) {
                        if (i % 5 == 0 && i % 3 != 0) {
                                divisableBy5 += i + " ";
                                i++;
                        }i++;
                }
                i = 1;
                while (i <= num) {
                        if (i % 3 == 0 && i % 5 != 0) {
                                divisableBy3 += i + " ";
                                i++;
                        }
                        i++;
                }
                System.out.println("divisableBy15 : " + divisableBy15);
                System.out.println("divisableBy5 = " + divisableBy5);
                System.out.println("divisableBy3 = " + divisableBy3);
        }
}