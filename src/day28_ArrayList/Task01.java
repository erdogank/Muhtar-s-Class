package day28_ArrayList;

import Day20_Arrays.Task03;

import java.util.ArrayList;

public class Task01 {
    public static void main(String[] args) {

        /*1. write a program that can set the last element of the Integer arraylist to zero
        ex:
        list = [1,2,3,4,5];
        output: [1,2,3,4,0]; */

        ArrayList<Integer> list = new ArrayList<>();

       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);

        System.out.println(list);

        list.set(4,0);
        System.out.println(list);

        list.set(4,5);

       // list.add(6);

       /*list.set(list.size()-1,list.get(0));
       list.set(0,list.get(list.size()-2));
       list.remove(list.size()-2);
        System.out.println(list);*/

        //Task03
    for (Integer element : list) {

            if(element%2==1)
                list.set(list.indexOf(element),element*2);

        }
        System.out.println(list);

    //Task04
        String[] arr1 = {"A", "B", "C"};
        String [] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> letters = new ArrayList<>();

        int i = 0;

        for (String each : arr1) {

            letters.add(i++,each);

        }
        for (String each : arr2) {
            letters.add(i++,each);

        }
        System.out.println(letters);








        }




    }

