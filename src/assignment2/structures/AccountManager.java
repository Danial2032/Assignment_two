package assignment2.structures;
import java.util.*;
import assignment2.BankAccount;

public class AccountManager{
    public LinkedList<BankAccount> accounts= new LinkedList<>();

    public void AddAccount(BankAccount acc){
        accounts.add(acc);
        System.out.println("Account added successfully");
    }

    public void displayAccounts(){
        int i=1;
        for(BankAccount acc: accounts){
            System.out.print(i++ + ".");
            acc.display();
        }
    }
    public BankAccount searchAccount(String username){
        for(BankAccount acc: accounts){
            if(acc.username.equalsIgnoreCase(username)){
                return acc;
            }
        }
        return null;
    }
}