package day14_String_Methods;

import java.util.Scanner;

public class AccountNumber {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter your account number");
        String accountNumber= input.next();

        char firstChar=accountNumber.charAt(0);
        int length=accountNumber.length();
        System.out.println("First Character = " + firstChar);
        System.out.println("Length = " + length);

        if((firstChar=='2'&&length==7)||(firstChar=='5'&&length==10)){
            System.out.println("account number is valid");
        }else{
            System.out.println("invalid account number");
        }
    }
}
