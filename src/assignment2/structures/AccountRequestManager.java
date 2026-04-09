package assignment2.structures;

import java.util.*;
import assignment2.BankAccount;

public class AccountRequestManager {
    Queue<BankAccount> requests = new LinkedList<>();


    public void request(String name) {
        requests.add(new BankAccount(0, name, 0));
        System.out.println("Request submitted");
    }

    public BankAccount proccess(){
        return requests.poll();
    }

    public void show(){
        System.out.println("Pending Requests:");
        for(BankAccount acc : requests){
            System.out.println(acc.username);
        }
    }
}
