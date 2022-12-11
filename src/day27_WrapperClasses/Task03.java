package day27_WrapperClasses;

public class Task03 {

    public static void main(String[] args) {

        String str = "Wooden Spoon!";

        String letters= "";
        String digits = "";
        String specialChars ="";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(Character.isDigit(ch)){
                digits+=ch;
            }
            if(Character.isLetter(ch)){
                letters+=ch;
            }
            if(!(Character.isLetterOrDigit(ch))){
                if(ch!=' ')
                specialChars+=ch;
            }

        }
        System.out.println("letters are: "+letters);
        System.out.println("digits are: "+digits);
        System.out.println("special chars :"+specialChars);

    }
}
