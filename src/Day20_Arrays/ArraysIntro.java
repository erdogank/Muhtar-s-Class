package Day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        //create a variable that is capable of 5 names
        String[] myGroup= new String[5];                  //or String myGroup[];
        myGroup[0]="erdogan";
        myGroup[1]="recep";
        myGroup[2]="mustafa";
        myGroup[3]="gökhan";
        myGroup[4]="taha";
        //myGroup[5]="ömer"; it will give error. only 5 elements is assigned.

        System.out.println(Arrays.toString(myGroup));

        System.out.println("**********************************************");

        String[] days={ "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","Sunday"};
        System.out.println(Arrays.toString(days));
        System.out.println(days[2]);

        int number=5;
        System.out.println(days[number]);

        System.out.println("************************************");

        for (int i = 0; i <7 ; i++) {

            if(i==5||i==6){
                continue;

            }
            System.out.println(days[i]);
        }










    }
}
