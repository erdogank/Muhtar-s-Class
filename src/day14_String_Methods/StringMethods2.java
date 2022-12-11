package day14_String_Methods;

public class StringMethods2 {

    public static void main(String[] args) {


        String str ="Java is fun, I love learning Java.";

        str =str.replace("Java","Computer");

        System.out.println("str = " + str);

        str=str.replaceFirst("Computer","Java");//to replace only the first input

        System.out.println("str = " + str);

        String email="JohnSmith@yahoo.com";

        email.replace("yahoo","gmail");
        email=email.replace("yahoo","gmail");
        System.out.println("email = " + email);

        String str2="Java Programmming Language";

        String Programming=str2.substring(str2.indexOf("Pr"),str2.indexOf(" L"));//to get the second word out of the sentence
        System.out.println("Programming = " + Programming);









    }
}
