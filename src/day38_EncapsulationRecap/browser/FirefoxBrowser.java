package day38_EncapsulationRecap.browser;

public class FirefoxBrowser extends Browser {
    public static void main(String[] args) {


        FirefoxBrowser ff1 = new FirefoxBrowser();
        ff1.openBrowser();
        ff1.closeBrowser();





    }
@Override
    public void openBrowser(){
        System.out.println("firefox is opening");
    }

    public void closeBrowser(){
        System.out.println("firefox is closing");
    }


}
