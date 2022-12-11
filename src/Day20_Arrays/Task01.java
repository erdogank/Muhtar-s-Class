package Day20_Arrays;

public class Task01 {
    public static void main(String[] args) {

        String[] classmates={"Kadir Yetim", "Safa Dönergöz", "Mehmet Albayrak", "Selim Mazlıah ", "Recep Demir", "Özkan Toker", "Mustafa Ulusoy", "Tuğrahan Sezer", "Gökhan Temel", "Yusuf Sofuoğlu"};

       String initial;

        for (int i = 0; i < classmates.length; i++) {

            int surnameIndex = classmates[i].indexOf(" ");

            String surnameInitial = classmates[i].substring(surnameIndex+1).charAt(0)+"";

            initial =classmates[i].charAt(0)+" "+surnameInitial;

            System.out.println(initial);

        }






    }
}
