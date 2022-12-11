package day19_LoopPractices;

public class FirstDublicated {
    public static void main(String[] args) {
        String str = "baadcccd";
        String result = ""; //a2b1c3d1


//code is wrong...

        for (int i = 0; i <str.length() ; i++) {

            char ch=str.charAt(i);
            int count=0;

            for (int j = 0; j < str.length(); j++) {

                char compare=str.charAt(j);

                if(ch==compare){
                    count++;
                }

            }
            if(result.contains(""+ch)){
                continue;
            }
            result+=ch;
            result+=count;

        }
        System.out.println(result);
        System.out.println(result.charAt(0));







    }

}
/*
1. Write a program that can find the frequency of the characters from a string
			 Ex:
                        str = "aabcccd";
                        output:
                                a2b1c3d1
 */