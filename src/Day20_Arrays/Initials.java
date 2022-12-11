package Day20_Arrays;

public class Initials {

    public static void main(String[] args) {

        String[] names = {"Taha Yasin Ramazan Uysal", "Zygmunt Bauman", "Kurt Cobain", "Emile Durkheim", "Sigmund Freud", "Mark Twain", "Harper Lee", "Truman Capote", "Haruki Murakami", "Oscar Wilde"};

        String initials = "";

        for (String each : names) {

            initials = "";

            String[] forInitials = each.split(" ");

            for (String eachIn : forInitials) {

                initials += eachIn.charAt(0)+".";

            }
            System.out.println(each+" - "+initials);


        }



    }
}