package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class Task03_01 {

    public static void main(String[] args) {

        String[] batch25Group1 = {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"};
        String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
        String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};

        String[][] batch25Groups = new String[3][];

        batch25Groups[0]=batch25Group1;
        batch25Groups[1]=batch25Group2;
        batch25Groups[2]=batch25Group3;

        System.out.println("Batch 25: "+Arrays.deepToString(batch25Groups));

        String[] batch24Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch24Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        String[][] batch24Groups = {batch24Group1,batch24Group2,batch24Group3};

        System.out.println("Batch 24: "+Arrays.deepToString(batch24Groups));

        String[][][] CydeoStudents = new String[2][][];

        CydeoStudents[0] = batch24Groups;
        CydeoStudents[1] = batch25Groups;

        for (int i = 0; i < CydeoStudents.length ; i++) {

            for (int j = 0; j < CydeoStudents[i].length ; j++) {

                for (int k = 0; k < CydeoStudents[i][j].length; k++) {

                    System.out.println(CydeoStudents[i][j][k]);

                }

            }

        }










    }
}
