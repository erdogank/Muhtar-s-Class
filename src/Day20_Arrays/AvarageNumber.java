package Day20_Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class AvarageNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numbers= {10, 20, 21, 25, 33, 35};

        int sum=0;

        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];

        }
        double avarage= sum/numbers.length;

        System.out.println(sum);

        System.out.println(avarage);

    }

}
