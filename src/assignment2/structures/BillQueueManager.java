package assignment2.structures;

import java.util.*;

public class BillQueueManager{
    Queue<String> bills= new LinkedList<>();

    public void addBill(String bill){
        bills.add(bill);
        System.out.println("Added: " + bill);
    }

    public void proccessBill() {
        if (!bills.isEmpty()) {
            System.out.println("Proccessing: " + bills.poll());
        } else {
            System.out.println("No bills in queue.");
        }
    }
        public void display(){
            System.out.println("Bill queue: " + bills);
        }
}
