package day15_For_Loop;

import java.util.Scanner;

public class Retiving {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = input.nextLine();

        String letters= "";
        String digits= "";
        String specialChar= "";

        for(int i=0 ; i<str.length() ; i++){



                if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
                    letters = letters + str.charAt(i) ;
                } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    digits += str.charAt(i);
                } else {
                    specialChar += str.charAt(i);
                }
            }


        System.out.println("letters      :"+letters);
        System.out.println("digits       :"+digits);
        System.out.println("special chars:"+specialChar);

        input.close();

    }
}