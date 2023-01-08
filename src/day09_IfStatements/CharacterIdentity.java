package day09_IfStatements;

public class CharacterIdentity {

    public static void main(String[] args) {
        int character='@';
        if (character>=65&&character<=90||character>=97&&character<=122){
            System.out.println("Alphabetic Character");
        } else if (character>=48&&character<=57) {
            System.out.println("Rigid Character");

        }else {
            System.out.println("Special Character");
        }

    }

}