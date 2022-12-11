package day19_LoopPractices;

public class indexOfFirstUnique {
    public static void main(String[] args) {
        String str = "aaafffjjkllldnnn";
        String result = "";
        char ch = 0;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char eachchar = str.charAt(j);
                if (ch == eachchar) {
                    count++;
                }
            }
            if (count == 1) {
                result += ch;
                break;
            }
        }
        int son= str.indexOf(result);
        System.out.println(result);
        System.out.println(son);


    }





}
