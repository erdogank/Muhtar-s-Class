package day28_ArrayList;

import java.util.ArrayList;

public class Task07FirstDupElement {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(7);

        System.out.println(list);

        int frequency = 0;

        for (int i = 0; i < list.size(); i++) {
            frequency=0;

            for (int i1 = 0; i1 <= i; i1++) {
                if(list.get(i)==list.get(i1))
                    frequency++;

            }
            if(frequency==2) {
                System.out.println(list.get(i));
                break;
        }


            }

        }





    }

