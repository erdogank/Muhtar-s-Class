package day38_EncapsulationRecap.browser;

public class OperaBrowser extends Browser {

    public static void main(String[] args) {
        OperaBrowser ob1 = new OperaBrowser();

        ob1.openBrowser();
        ob1.closeBrowser();

    }

    public void openBrowser(){
        System.out.println("opera is opening");
    }
    public void closeBrowser(){
        System.out.println("opera is closing");
    }
}
