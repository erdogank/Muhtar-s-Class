package Group9.interviewQuestions;

import java.util.Arrays;

public class InterviewQ {

    public static void main(String[] args) {

        /*
        Push all the zero’s in the array to the start and all the one’s to the end of
the array:
        {1, 9, 1, 8, 4, 0, 1, 0, 2, 7, 0, 6, 0} → {1, 1, 1, 9, 8, 4, 2, 7, 6, 0, 0, 0,0}
         */

        int[] numlist ={1, 9, 1, 8, 4, 0, 1, 0, 2, 7, 0, 6, 0};

        int[] newList = new int[numlist.length];

        int startIndex = 0;
        int lastIndex = numlist.length-1;

        for (int i = 0; i < numlist.length ; i++) {

            if(numlist[i] ==1){
                newList[startIndex] = 1;
                startIndex++;

            }
            if(numlist[i] ==0){
                newList[lastIndex] = 0;
                lastIndex--;
            }

        }
        for (int i = 0; i < numlist.length ; i++) {
            if(numlist[i]!=0&&numlist[i]!=1){

                newList[startIndex] =numlist[i];
                startIndex++;
            }

        }
        System.out.println(Arrays.toString(newList));

    }
}
