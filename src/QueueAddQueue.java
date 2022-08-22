import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueAddQueue {
    Queue<Integer> queue = new LinkedList<>();
    Queue<Integer> removal = new LinkedList<>();
    Queue<Integer> addRemovedElements = new LinkedList<>();
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
    private void removeElements(){
        try {
            // will try to remove two elements from the queue and add them in the stackRemoved
            for (int i = 0; i < 2; i++)
                removal.add(queue.remove());
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
                addRemovedElements.add(queue.remove());
        }catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }
    }
    private void display(){
        System.out.println("Elements removed from the queue are - ");
        removal.forEach(System.out::println);
        System.out.println("Elements remaining after the removal of above Integer -");
        addRemovedElements.forEach(System.out::println);
    }

    public static void main(String[] args)throws IOException{
        QueueAddQueue qa = new QueueAddQueue();
        qa.input();
        qa.removeElements();
        qa.addRemainingElements();
        qa.display();
    }
}
