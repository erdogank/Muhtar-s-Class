package day24_VoidAndReturn;

public class Test2 {
    public static void main(String[] args) {

        int[]  arr = {10, 4, 3, 150, 23, 90};

        int largest = Integer.MIN_VALUE;

        for (int each : arr) {

            if(each>largest)
                largest=each;

        }
        System.out.println("largest number is:"+largest);

    }
}
