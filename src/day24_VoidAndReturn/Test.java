package day24_VoidAndReturn;



public class Test {

    public static void main(String[] args) {

        String str = "w3refsourfce";

        for (int i = 0; i <str.length() ; i++) {


            int count = 0;

            for (int j = 0; j < str.length() ; j++) {

                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }if(count>1){

                String replaceData=str.charAt(i)+"";


                str=str.replaceFirst(str.charAt(i)+"","@");
                str=str.replaceAll(replaceData,"");
                str=str.replaceAll("@",replaceData);

            }

            }
        System.out.println("str = " + str);
    }
}
