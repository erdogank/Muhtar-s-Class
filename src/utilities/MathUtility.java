package utilities;

public class MathUtility {

    //Sum of two numbers
    public static int sumOfTwoNums (int num1, int num2 ){

        return  num1+num2;

    }

    //Sum of two numbers
    public static double sumOfTwoNums (double num1, double num2 ){

        return  num1+num2;

    }

    //substraction of two numbers
    public static int subtractTwo(int num1, int num2){
        return num1-num2;
    }
    //substraction of two numbers
    public static double subtractTwo(double num1, double num2){
        return num1-num2;
    }

    //multiplicatiob of two numbers
    public static int multiplicationOfTwo(int num1, int num2){
        return num1*num2;

    }

    //multiplicatiob of two numbers

    public static double multiplicationOfTwo(double num1, double num2){
        return num1*num2;

    }

    //divide two numbers
    public static double divideTwoNumbers(int num1, int num2){
        return num1/num2;
    }

    //divide two numbers
    public static double divideTwoNumbers(double num1, double num2){
        return num1/num2;
    }


    //check if an integer number even
    public static void isEven(int num){
        if(num%2==0)
            System.out.println(num + " is even number");
        else
            System.out.println(num +" is not even number");
    }

    //check if an integer number odd
    public static void isOdd(int num){
        if(num%2==1)
            System.out.println(num +" is odd number");
        else
            System.out.println(num +" is not odd number");
    }

  //returns the maximum of two number
    public static int MaxOfTwo(int num1, int num2){
        int max=0;
        if(num1>num2)
            max= num1;
        else
            max=num2;

        return max;

    }

    //returns the maximum of two number
    public static double MaxOfTwo(double num1, double num2){
        double max=0;
        if(num1>num2)
            max= num1;
        else
            max=num2;

        return max;

    }

    //returns the minimum of two number
    public static int MinOfTwo(int num1, int num2){
        int min=0;
        if(num1>num2)
            min= num2;
        else
            min=num1;
        return min;
    }

    //returns the minimum of two number
    public static double MinOfTwo(double num1, double num2){
        double min=0;
        if(num1>num2)
            min= num1;
        else
            min=num2;
        return min;
    }

    //square of a number
    public static int squareOfTwoNumbers(int num){
        return num*num;
    }

    //square of two numbers
    public static double squareOfTwoNumbers(double num){
        return num*num;
    }

    //cube of a number
    public static int cubeTwoNumbers(int num){
        return num*num*num;
    }

    //cube of a number
    public static double cubeTwoNumbers(double num){
        return num*num*num;
    }



















}
