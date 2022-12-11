package day21_ForEachLoop;

import java.util.Arrays;

public class IntialForEach {

    public static void main(String[] args) {

        String[] classmates={"Kadir Yetim", "Safa Dönergöz", "Mehmet Albayrak", "Selim Mazlıah ", "Recep Demir",
                "Özkan Toker", "Mustafa Ulusoy", "Tuğrahan Sezer", "Gökhan Temel", "Yusuf Sofuoğlu"};


        for (String each : classmates) {

            String initial = each.charAt(0)+"."+each.charAt(each.indexOf(" ") +1);

            System.out.println(initial);

        }




    }
}
