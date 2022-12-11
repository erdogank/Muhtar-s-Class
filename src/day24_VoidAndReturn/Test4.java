package day24_VoidAndReturn;

public class Test4 {

    public static void main(String[] args) {

        String str = "amazon";

        String result = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            result+= str.charAt(i)+"-";


        }
        result = result.substring(0,result.length()-1);
        System.out.println(result);





    }
}
