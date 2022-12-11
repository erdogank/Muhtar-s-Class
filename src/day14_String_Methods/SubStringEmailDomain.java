package day14_String_Methods;

import java.util.Scanner;

public class SubStringEmailDomain {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        //write a program that can get domain from any email adress:
        //ex:cydeo.school@gmail.com output:gmail

        String mail= scan.nextLine();

        int indexad=mail.indexOf("@")+1;
        int last=mail.lastIndexOf(".");
        String domain=mail.substring(indexad,last);
        System.out.println("domain: "+domain);








    }
}
