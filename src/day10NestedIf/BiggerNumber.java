package day10NestedIf;

public class BiggerNumber {

    public static void main(String[] args) {

        int num1=100;
        int num2=50;
        int num3=30;

        String result =(num1>num2&&num1>num3)?"n1 is bigger":(num2>num1&&num2>num3)?"num2 is bigger":"num3 is bigger";

        System.out.println("result = " + result);




       /* Create a class called BiggerNum, write a program that checks for the
        bigger of 3 numbers.
                you get 3 int variables with DIFFERENT values: n1 , n2 and n3
        if n1 is biggest output: "n1 is bigger"
        if n2 is biggest output: "n2 is bigger"
        if n3 is biggest output: "n3 is bigger"
        NOTE: MUST USE TERNARY
        */
    }
}
