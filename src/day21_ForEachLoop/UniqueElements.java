package day21_ForEachLoop;

public class UniqueElements {

    public static void main(String[] args) {

        String[] words ={ "java", "java", "c#", "python", "python"};

        int count = 0;


        for (String each : words) {

            count=0;

            for (String elements : words) {

                if(elements.equals(each)){

                    count++;

                }
            }
            if (count==1){
                    System.out.println(each);


            }



        }




    }
}
