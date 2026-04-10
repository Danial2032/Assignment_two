package assignment2;

import java.util.Scanner;
import assignment2.structures.*;

public class BankSystem {
    AccountManager accountManager = new AccountManager();
    TransactionManager transactionManager = new TransactionManager();
    BillQueueManager billManager = new BillQueueManager();
    AccountRequestManager requestManager = new AccountRequestManager();

    Scanner sc = new Scanner(System.in);

    //Deposit
    public void deposit(){
        System.out.println("Enter username: ");
        String name = sc.next();

        BankAccount acc = accountManager.searchAccount(name);

        if(acc!= null){
            System.out.print("Amount: ");
            double amount = sc.nextDouble();

            acc.balance += amount;
            transactionManager.add("Deposit " + amount + " to " + name);
            System.out.println("Deposit " + amount + " to " + name);

            System.out.println("New balance: " + acc.balance);
        }
        else{
            System.out.println("Account not found!");
        }
    }

    //Withdraw
    public void withdraw(){
        System.out.println("Enter username: ");
        String name = sc.next();

        BankAccount acc = accountManager.searchAccount(name);

        if(acc != null){
            System.out.println("Amount: ");
            double amount = sc.nextDouble();

            if(acc.balance >= amount){
                acc.balance -= amount;

                transactionManager.add("Withdraw " + amount + " from " + name);
                System.out.println("Withdraw " + amount + " from " + name);

                System.out.println("New balance: " + acc.balance);
            }
            else{
                System.out.println("Insufficient balance");
            }
        }
        else{
            System.out.println("Account not found");
        }
    }

    //Request account
    public void requestAccount(){
        System.out.println("Enter username: ");
        String name = sc.nextLine();
        requestManager.request(name);
    }

    //Process request
    public void processRequest(){
        BankAccount req= requestManager.proccess();

        if(req!= null){
            System.out.println("Assign account number: ");
            int accNo = sc.nextInt();

            req.accountNumber = accNo;
            accountManager.AddAccount(req);

            System.out.println("Account created for " + req.username);
        }
        else{
            System.out.println("No requests.");
        }
    }
}

