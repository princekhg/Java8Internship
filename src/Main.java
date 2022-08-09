// this is the question

public class Main extends Thread {
    int[] arr = {1, 2, 3, 4, 5};

    public void run() {
        for (int i : arr) {
            System.out.println("From Thread A -> " + i);
        }
    }

}

// Second Thread Class
class MultiThreadSec extends Main{
    public void run(){
        for(int i:arr)
            System.out.println("From Thread B ->" +i);
    }
}
// Runner Thread Class Executing the other thread classes
 class RunnerClassThreadA {
    public static void main(String[] args) {
        new Main().start();
        new MultiThreadSec().start();
    }
}
