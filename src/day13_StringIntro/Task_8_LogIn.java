package day13_StringIntro;

import java.util.Scanner;

public class Task_8_LogIn {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("please enter your user name");
        String username= input.next();
        System.out.println("please enter your password");
        String password= input.next();

        if(username.equals("Cydeo")&&password.equals("WoodenSpoon")){

            System.out.println("\nLogged in");
        }else{
            System.out.println("\nwrong credential");
        }





    }
}
