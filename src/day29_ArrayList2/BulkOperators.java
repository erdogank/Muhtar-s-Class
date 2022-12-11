package day29_ArrayList2;

import java.util.*;

public class BulkOperators {
    public static void main(String[] args) {


        ArrayList<Integer> listofNum = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println(listofNum);

        listofNum.remove(0);
        listofNum.removeAll(Arrays.asList(2,3,4));
        listofNum.retainAll(Arrays.asList(6,7));
        listofNum.addAll(Arrays.asList(8,9,10,11,12));
        System.out.println(listofNum);

        listofNum.removeIf(p -> p>=9);
        System.out.println(listofNum);


        int num = Collections.min(listofNum);
        System.out.println(num);

        listofNum.addAll(Arrays.asList(9,10,11,12));
        System.out.println(listofNum);

        Collections.swap(listofNum,0,listofNum.size()-1);
        System.out.println(listofNum);

        Collections.reverse(listofNum);
        System.out.println(listofNum);







    }
}
