import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

public class QueueStack {
    Queue<Integer> queue = new LinkedList<>();
    List<Integer> stackElement = new Stack<>();
    List<Integer> stackRemoved = new Stack<>();
    private void input()throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 6 Integer values");
        try {
            for (int i = 0; i < 6; i++)
                queue.add(Integer.parseInt(br.readLine()));
        }catch (NumberFormatException e){
            System.out.println(e.getMessage()+"Add valid Integer Input");
        }
    }
    // the remove method will remove elements in the FIFO format.
    // if the queue is empty it will throw NoSuchElementException
    private void removeElements(){
        try {
            // will try to remove two elements from the queue and add them in the stackRemoved
            for (int i = 0; i < 2; i++)
                stackRemoved.add(queue.remove());
        }catch (NoSuchElementException e)
        {
            System.out.println(e.getMessage());
        }
    }
    //adding the remaining elements to stack and printing them
    private void addRemainingElements(){
        try{
            int n = queue.size();
            for(int i=0;i<n;i++)
                stackElement.add(queue.remove());
        }catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }
    }

    // Methods to display elements......
    private void display(){
         System.out.println("Elements removed from the queue are - ");
         stackRemoved.forEach(System.out::println);
         System.out.println("Elements remaining after the removal of above Integer -");
         stackElement.forEach(System.out::println);
    }

    public static void main(String[] args) throws IOException{
        QueueStack qs = new QueueStack();
        qs.input();
        qs.removeElements();
        qs.addRemainingElements();
        qs.display();
    }
}
