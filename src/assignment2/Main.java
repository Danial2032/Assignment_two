package assignment2;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        BankSystem system = new BankSystem();
        Scanner sc = new Scanner(System.in);

//Array Example (Task 6)
        BankAccount[] storedAccounts = new BankAccount[3];

        storedAccounts[0] = new BankAccount(1,"Ali",120000);
        storedAccounts[1] = new BankAccount(2,"Arman",250000);
        storedAccounts[2] = new BankAccount(3,"Danial",180000);

        System.out.println("Stored Accounts: ");
        for(BankAccount acc : storedAccounts){
            System.out.println(acc);
        }
        system.accountManager.accounts.addAll(Arrays.asList(storedAccounts));

        while(true){
            System.out.println("\n=== MAIN MENU ===");
            System.out.println("1-Bank");
            System.out.println("2-ATM");
            System.out.println("3-Admin");
            System.out.println("4-Exit");

            int choice = sc.nextInt();

            switch(choice){
                case 1: System.out.println("1- Request Account\n2-Deposit\n3-Withdraw\n4-Search account by username");
                int b = sc.nextInt();
                    if (b == 1) {
                        system.requestAccount();
                    }
                    else if (b == 2) {
                        system.deposit();
                    }
                    else if (b == 3) {
                        system.withdraw();
                    }
                    else if (b == 4) {
                        System.out.println("Enter username that you want to find: ");
                        String usernam = sc.next();
                        system.accountManager.OutputAccountByName(usernam);
                    }
                    break;
                case 2: System.out.println("1- Balance(Display all accounts)\n2-Withdraw\n3-Last Transaction\n4-Undo last transaction");
                    int a = sc.nextInt();
                    if (a == 1) {
                        system.accountManager.displayAccounts();
                    }
                    else if (a == 2) {
                        system.withdraw();
                    }
                    else if (a == 3) {
                        system.transactionManager.showLast();
                    }
                    else if (a == 4) {
                        system.transactionManager.undo();
                    }
                    break;
                case 3: System.out.println("1- Process Accounts\n2-Show Requests\n3-Process Bills\n4-Add Bill\n5-Display Bills");
                    int c = sc.nextInt();
                    if (c == 1) {
                        system.processRequest();
                    }
                    else if (c == 2) {
                        system.requestManager.show();
                    }
                    else if (c == 3) {
                        system.billManager.display();
                        system.billManager.proccessBill();
                    }
                    else if (c == 4) {
                        System.out.println("Enter name of the bill: ");
                        String bil = sc.next();
                        system.billManager.addBill(bil);
                    }
                    else if (c == 5) {
                        system.billManager.display();
                    }
                    break;
                case 4: System.exit(0);
                    }
            }
        }

    }