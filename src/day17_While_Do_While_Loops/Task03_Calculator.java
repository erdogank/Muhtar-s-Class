package day17_While_Do_While_Loops;

import java.util.Scanner;

public class Task03_Calculator {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("enter a number");
        int number= scan.nextInt();
        System.out.println("enter another number");
        int number2= scan.nextInt();
        System.out.println("enter an operator + - * or /");
        String operator= scan.next();
        int result=0;

        while(!(operator.equals("+")||operator.equals("-")||operator.equals("*")||operator.equals("/"))){

            System.out.println("Invalid Operator");
            System.out.println("enter an operator + - * or /");
            operator= scan.next();
        }
        if(operator.equals("+")){
            result=number+number2;

        }else if(operator.equals("-")){
            result=number-number2;

        }else if(operator.equals("*")){
            result=number*number2;
        }else{
            result=number/number2;
        }
        System.out.println("result = " + result);
    }
}
