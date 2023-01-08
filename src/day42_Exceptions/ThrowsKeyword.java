package day42_Exceptions;



public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("-------Test1--------");

        System.out.println("Hello");
        Thread.sleep(1000);
        System.out.println("Cydeo");

        System.out.println("------Test1 completed-------");

        System.out.println("------Test2--------");

        System.out.println("Hello");
        Thread.sleep(1000);
        System.out.println("Cydeo");

        System.out.println("------Test2 completed-------");

        String word = null;
        try{
            System.out.println(word.charAt(0));
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }









    }
}
