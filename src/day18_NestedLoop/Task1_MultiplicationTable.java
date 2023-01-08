package day18_NestedLoop;

public class Task1_MultiplicationTable {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) { // this is for rows

            for (int j = 0; j <= 10 ; j++) { // this is for columns



                System.out.print( i + j + "\t" );

            }


            System.out.println("*");
        }

    }
}
