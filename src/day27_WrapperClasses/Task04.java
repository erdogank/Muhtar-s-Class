package day27_WrapperClasses;

public class Task04 {

    public static void main(String[] args) {

        String str = "JAVA java";
        boolean result = false;
        int countLower = 0;
        int countUpper = 0;

        for (int i = 0; i <str.length() ; i++) {

            char ch = str.charAt(i);

            if(Character.isLowerCase(ch))
                countLower++;
            if(Character.isUpperCase(ch))
                countUpper++;

        }
        if (countLower==countUpper) {
            result = true;
        }
        System.out.println(result);

    }
}
