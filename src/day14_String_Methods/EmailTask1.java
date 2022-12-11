package day14_String_Methods;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter your email");

        String mail= input.nextLine();

        boolean hasunderscore=mail.contains("_");


        if(hasunderscore) {

            int firstLast = mail.indexOf("_");
            int at = mail.indexOf("@");

            String firstName = mail.substring(0, firstLast);
            String lastName = mail.substring((firstLast + 1), at);
            String domain = mail.substring(at);

            System.out.println(lastName + "_" + firstName + domain);
        }
        else{
            System.out.println("mail = " + mail);
        }





















    }

}
