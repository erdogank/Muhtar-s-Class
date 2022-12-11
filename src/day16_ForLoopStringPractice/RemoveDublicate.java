package day16_ForLoopStringPractice;

public class RemoveDublicate {
    public static void main(String[] args) {


        String word="ABACBBC";
        String newWord="";

        for(int i=0; i<word.length();i++){
            String ch=""+word.charAt(i);
            
            if(!newWord.contains(ch)) {
                newWord += ch;

            }
        }System.out.println("newWord = " + newWord);




    }
}
