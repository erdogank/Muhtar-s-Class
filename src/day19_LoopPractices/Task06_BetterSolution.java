package day19_LoopPractices;

import java.util.Scanner;

public class Task06_BetterSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int frequency = 0;
        String total = "";

        System.out.print("PLEASE ENTER A STRİNG : ");
        String str = scanner.next();

        for (int i = 0; i < str.length(); i++) {
            int counter = 0;
            String temporary = str.charAt(i) + " ";
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    counter++;
                }
            }

            if (counter > frequency) {
                total = temporary;
                frequency = counter;
            } else if (counter == frequency && !total.contains(temporary)) {
                total += (temporary);
            }

        }
        System.out.println("Total Is : " + total);
        System.out.println("frequency = " + frequency);
    }
}