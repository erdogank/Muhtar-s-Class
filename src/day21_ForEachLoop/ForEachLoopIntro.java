package day21_ForEachLoop;

public class ForEachLoopIntro {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60,70};

        for (int i = 0; i < numbers.length ; i++) {

            int eachElements=numbers[i];

            System.out.println(eachElements);



        }
        System.out.println("*********************");

        for(int eachElements2:numbers){
            System.out.println(eachElements2);
        }








    }
}
