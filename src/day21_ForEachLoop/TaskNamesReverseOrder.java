package day21_ForEachLoop;

import java.util.Arrays;

public class TaskNamesReverseOrder {

    public static void main(String[] args) {

        String[] classmates={"Kadir Yetim", "Safa Dönergöz", "Mehmet Albayrak", "Selim Mazlıah ", "Recep Demir",
                "Özkan Toker", "Mustafa Ulusoy", "Tuğrahan Sezer", "Gökhan Temel", "Yusuf Sofuoğlu"};

        for (String each : classmates) {

            String reversed = "";

            for (int i = classmates.length; i>=0; i--) {

                reversed += each.charAt(i);

            }
            System.out.println(reversed);

        }





    }
}
