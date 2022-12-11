package day14_String_Methods;

public class SampleReplaceAll {
    public static void main(String[] args) {

        String str = "Ja5+va cok 1*guzel";

        str= str.replaceAll("\\d", "");
        str=str.replaceAll(" ","5");
        str=str.replaceAll("\\W","");
        str=str.replaceAll("5", " ");

        System.out.println(str);










    }
}
