package day14_String_Methods;

public class StringMethods1 {

    public static void main(String[] args) {

        String word = "     cydeo    rocks    ";
        word = word.trim();

        System.out.println("word = " + word);






        String sentence="What a beautiful day today";

        int num1=sentence.indexOf("au");//to find the index number of a character from left
        System.out.println("num1 = " + num1);

        int num2=sentence.lastIndexOf("y");////to find the index number of a character from right to left
        System.out.println("num2 = " + num2);




    }
}
