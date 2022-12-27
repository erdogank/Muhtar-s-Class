package day41;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("test started");

        try {

            System.out.println(9 / 0);
            System.out.println("Try Block");
        }
        catch (RuntimeException e){
            System.out.println("Catch Block");
           e.printStackTrace();

        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        try {
//            FileInputStream fis = new FileInputStream("File Path");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }


        System.out.println("test completed");
    }
}
