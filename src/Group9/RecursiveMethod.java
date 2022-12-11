package Group9;

public class RecursiveMethod {

    public static void main(String[] args) {

//sum of the numbers from a given number to zero

        int input = 6;

        int result = sum(input);
        System.out.println(result);
    }

    public static int sum (int number){

        /*int result = 0;
        for (int i = number; i >=0; i--) {
            result+=i;
        }
        return result; */

        if(number==1)
            return 1;
        else{
          return number+sum(number-1);
        }

    }



}
