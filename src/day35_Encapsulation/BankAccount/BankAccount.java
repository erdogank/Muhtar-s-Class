package day35_Encapsulation.BankAccount;

public class BankAccount {

    private String accountHolder;
    private int accountNumber;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(int accountNumber) {
        if(accountNumber<=0){
            System.err.println("invalid account number");
            System.exit(1);
        }
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        setBalance(balance);

    }

    public double deposit(double money){
        balance+=money;
        return balance;

    }
    public double withDraw(double money){

        if(money>balance){
            System.out.println("you do not have enough balance to withdraw. your max amount is "+balance);
        }else {
            balance -= money;
        }
        return balance;
    }
    public void checkBalance(){
        System.out.println("balance is $"+balance);

    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
