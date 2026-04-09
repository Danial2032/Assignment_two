package assignment2.structures;
import java.util.*;

public class TransactionManager{
    Stack<String> history = new Stack<>();

    public void add(String t){
        history.push(t);
    }

    public void showLast(){
        if(!history.isEmpty()){
            System.out.println("Last transaction: " + history.peek());
        }
        else{
            System.out.println("No transactions.");
        }
    }

    public void undo(){
        if(!history.isEmpty()){
            System.out.println("Undo: " + history.pop());
        }
        else{
            System.out.println("Nothing to undo.");
        }
    }
}