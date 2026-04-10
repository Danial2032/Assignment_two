package assignment2;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        BankSystem system = new BankSystem();
        Scanner sc = new Scanner(System.in);

//Array Example (Task 6)
        BankAccount[] arr = {new BankAccount(1, "Ali", 150000),
                new BankAccount(2, "Sara", 220000),
                new BankAccount(3, "John", 100000)};
        System.out.println("Array Accounts: ");
        for(BankAccount acc : arr){
        acc.display();
        }

        while(true){
            System.out.println("\n=== MAIN MENU ===");
            System.out.println("1-Bank");
            System.out.println("2-ATM");
            System.out.println("3-Admin");
            System.out.println("4-Exit");

            int choice = sc.nextInt();

            switch(choice){
                case 1: System.out.println("1- Request Account\n2-Deposit\n3-Withdraw");
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
                    break;
                case 2: System.out.println("1- Balance\n2-Withdraw\n3-Last Transaction\n4-Undo last transaction");
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
                case 3: System.out.println("1- Process Accounts\n2-Show Requests\n3-Bills");
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
                    break;
                case 4: System.exit(0);
                    }
            }
        }

    }