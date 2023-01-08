package day42_Exceptions;

public class Timer {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 60; i >=0 ; i--) {

            System.out.print("\rKalan Süre: "+i);

            Thread.sleep(1000);
        }
    }
}
