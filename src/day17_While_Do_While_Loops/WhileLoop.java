package day17_While_Do_While_Loops;

public class WhileLoop {
    public static void main(String[] args) {
        //While loop ile 1'den 100'e kadar "Welcome to Java" yazan program.
        System.out.println("While loop in Java");

        int count = 0;
        while (count < 10){
            count++; //count = count + 1
            System.out.println(count+"-Wellcome Java");

        }
        System.out.println("---------------------");
        System.out.println(count +  " - While loop bitti!");
        System.out.println("----------------------");


        count = 10;
        while (count > 0){
            System.out.print(count);
            System.out.println("-Welcome to Java.");
            count--; //count = count - 1
        }
        System.out.println("---------------------");
        System.out.println(count +  " - While loop bitti!");

    }
}