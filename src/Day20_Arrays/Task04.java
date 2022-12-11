package Day20_Arrays;

import java.util.Arrays;

public class Task04 {

    public static void main(String[] args) {

        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];

        for (int i = 0; i <3 ; i++) {

            switch(scores[i]){

                case 90:
                    grades[i]='A';
                    break;
                case 75:
                    grades[i]='C';
                    break;
                case 80:
                    grades[i]='B';
                    break;
            }

        }System.out.println(Arrays.toString(grades));

        for (int i = 0; i <3 ; i++) {

            System.out.println(names[i]+"'s score is "+scores[i]+", and grade is "+grades[i]);

        }









    }
}
