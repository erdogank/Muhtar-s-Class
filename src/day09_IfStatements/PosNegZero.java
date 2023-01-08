package day09_IfStatements;

public class PosNegZero {
    public static void main(String[] args) {


        int number = -0;

        if(number>0) {
            System.out.println("the number is positive");

        }else if (number<0) {
            System.out.println("the number is negative");

        }else{
            System.out.println("the number is 0");
        }
    }
}
