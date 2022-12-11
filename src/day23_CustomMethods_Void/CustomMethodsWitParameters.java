package day23_CustomMethods_Void;

public class CustomMethodsWitParameters {


    public static void main(String[] args) {

        printNumbers(10,20);


        //oddOrEven(20);




    }

    public static void oddOrEven(int number){

        if(number % 2 == 0){

            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");

        }

    }

    public static void printNumbers(int number1, int number2){

        for (int i = number1; i <=number2 ; i++) {

            System.out.println(i);

        }




    }


}
