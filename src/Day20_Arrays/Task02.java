package Day20_Arrays;

public class Task02 {
    public static void main(String[] args) {

        String[] classmates={"Kadir", "Safa", "Mehmet", "Selim", "Recep", "Özkan", "Mustafa", "Tuğrahan", "Gökhan", "Yusuf"};

        String rereverse="";


        for (int i = 0; i < classmates.length; i++) {

            rereverse="";


            String reverse= classmates[i];


            for (int j = reverse.length()-1; j >=0 ; j--) {

                rereverse+= reverse.charAt(j)+"";



            }

            System.out.println(rereverse);


        }






    }
}