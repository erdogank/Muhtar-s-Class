package day18_NestedLoop;

import java.util.Scanner;

public class CydeoCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double result=0;


        while(true){
        System.out.println("please enter a number");
        int number1 = input.nextInt();

        System.out.println("please enter an operator" );

        char op = input.next().charAt(0);


            while(!(op=='+'||op=='-'||op=='*'||op=='/')){
                System.out.println("invalid operator, please enter + - * or /");
                op=input.next().charAt(0);
            }
            System.out.println("please enter another number");
            int number2= input.nextInt();

            switch(op){

                case '+':
                    result=number1+number2;
                    break;
                case'-':
                    result=number1-number2;
                    break;
                case'*':
                    result=number1*number2;
                    break;
                case '/':
                    result=number1/number2;
                    break;

            }
            System.out.println("result = " + result);
            System.out.println("would you like to continue");
            String answer = input.next().toLowerCase();

            while(!(answer.equals("yes")||answer.equals("no"))){
                System.out.println("invalid entry please enter yes or no");
                answer = input.next().toLowerCase();

            }if(answer.equals("no")){

                break;

            }




        }System.out.println("Thank you for using Cydeo calculator");






    }
}
