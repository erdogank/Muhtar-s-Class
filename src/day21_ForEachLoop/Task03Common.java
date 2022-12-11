package day21_ForEachLoop;

public class Task03Common {
    public static void main(String[] args) {


        String common= "";

        int[]  arr1 = {1,2,3,4,5};
        int [] arr2= {4,5,6,7,8};

        for (int each1 : arr1) {

            for (int each2 : arr2) {

                if (each1==each2){
                    common +=each1+" ";
                }

            }

        }
        System.out.println("common = " + common);







    }
}
