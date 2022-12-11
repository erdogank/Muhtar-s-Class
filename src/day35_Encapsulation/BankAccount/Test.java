package day35_Encapsulation.BankAccount;

public class Test {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("adnan", 13,0);



        account1.setAccountNumber(13);

        account1.deposit(25);
        account1.checkBalance();
        account1.withDraw(30);
        //account1.checkBalance();




    }
}
