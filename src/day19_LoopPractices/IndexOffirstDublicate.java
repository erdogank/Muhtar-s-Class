package day19_LoopPractices;

public class IndexOffirstDublicate {
    public static void main(String[] args) {
        String str = "abcajccd";

        int index =0;

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j); // each character from string

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i); // each character of str

                if (ch == each && i != j) {
                    index =i;
                    System.out.println(index);
                    System.exit(0);
                }
            }
        }
    }
}
