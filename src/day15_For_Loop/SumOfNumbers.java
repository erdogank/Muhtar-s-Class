package day15_For_Loop;

public class SumOfNumbers {
    public static void main(String[] args) {




        double summ=0;
        for(int x=1; x<=100;x++){
            if(x%2==0){
                summ=summ+x;
            }
        }

        System.out.println("summ = " + summ);




    }
}
