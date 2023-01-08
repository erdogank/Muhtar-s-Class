package Group9;

public class Test {

    public static void main(String[] args) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello");

        int n = 10;
        String s;
        s=Integer.toString(n);
        System.out.println(s);
    }
}
