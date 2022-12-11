package day17_While_Do_While_Loops;

public class DoWhileLoopIntro {

    public static void main(String[] args) {
        boolean a = false;

        for(int i = 0; a;){
            System.out.println("Wooden Spoon -- for loop");//if condition is true(if a is true) it will print out loop
        }

        System.out.println("-------------------------------");

        while(a){
            System.out.println("Wooden Spoon -- while loop");//it will print out only a is true...the same like for loop
        }

        System.out.println("-------------------------------");


        do{
            System.out.println("Wooden Spoon -- do-while loop");//it will print one time then check if the condition is true or not
        }while(a);




    }


}