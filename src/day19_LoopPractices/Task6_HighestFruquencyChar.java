package day19_LoopPractices;

import java.util.Scanner;

public class Task6_HighestFruquencyChar {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("please enter a word.");
        String str = scan.next();
        String result = ""; //a2b1c3d1
        int highest=0;

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // each character from string
            int count = 0;

            for (int i = 0; i < str.length(); i++) { //to find the frequency of each character

                char each = str.charAt(i); // each character of str
                if(ch == each){

                    count++;
                    if(count>=highest){
                        highest=count;
                    }
                }
            }

            if(result.contains(""+ch)){
                continue;
            }

            result += ch;
            result += count;
        }

        System.out.println(result);//frequency of all chars

        String check=""+highest;//to convert the int to String

        System.out.println("most repeated char is: "+result.charAt(result.indexOf(check)-1));//the char that has the highest frequency is just before the highest number


    }

}









