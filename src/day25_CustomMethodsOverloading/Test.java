package day25_CustomMethodsOverloading;

public class Test {
    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 6;
        String str =num1+"";
    }
    String name;
    int numOfTests;

    public Test(String name, int numOfTests) {
        this.name = name;
        this.numOfTests = numOfTests;
    }
    public Test(int numOfTests, String name) {
        this.name = name;
        this.numOfTests = numOfTests;
    }
}
