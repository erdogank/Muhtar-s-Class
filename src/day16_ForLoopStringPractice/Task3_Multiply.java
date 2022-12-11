package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Task3_Multiply {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("please enter a positive number");
        int number1= scan.nextInt();
        System.out.println("please enter another positive number");
        int number2= scan.nextInt();

        int multiply=0;

        for(int i=1;i<=number1;i++){
            if(number1>0&&number2>0){
                multiply+=number2;
            }else{
                System.out.println("invalid");
            }
        }
        System.out.println(multiply);

    }
}
