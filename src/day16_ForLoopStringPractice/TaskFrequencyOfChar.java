package day16_ForLoopStringPractice;

import java.util.Scanner;

public class TaskFrequencyOfChar {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("please enter a string");
        String word= scan.nextLine();
        System.out.println("please enter a char");
        char ch= scan.next().charAt(0);
        int count=0;

        for(int i=0; i<word.length();i++){
            if(word.charAt(i)==ch){
                count++;
            }
        }
        System.out.println(count);

    }
}
