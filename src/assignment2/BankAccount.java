package assignment2;

public class BankAccount {
    public int accountNumber;
    public String username;
    public double balance;

    public BankAccount(int accountNumber, String username, double balance){
        this.accountNumber=accountNumber;
        this.username=username;
        this.balance=balance;
    }

    public void display(){
        System.out.println(username + " - Balance: "+ balance);
    }

    @Override
    public String toString(){
        return "BankAccount [ID:" + accountNumber + ",Name: " + username + ",Balance: " + balance + "]";
    }
}
