package day27_WrapperClasses;

import java.util.Arrays;

public class Taskcheck {


    public static void main(String[] args) {


        int [] array = {10, 20, 30, 40, 50};
        array=insert(array,0,100);

        System.out.println(Arrays.toString(array));

    }
    public static int [] insert( int [] array,int index, int element){
        int [] result = new int[array.length+1];

        for (int i = 0, j = 0; i < array.length+1; i++, j++) {
            result[i]=array[j];
            if (i==index){
                result[i]=element;
                j--;

            }
        }
        return result;
    }

    }


