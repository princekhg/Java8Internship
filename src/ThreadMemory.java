import java.sql.PseudoColumnUsage;

public class ThreadMemory extends Thread{
    public static void main(String[] args) {
        ThreadMemory tm = new ThreadMemory();
        tm.start();
        System.out.println("This is the entry point");
        firstMethod();
        secondMethod();
    }
        private static  void firstMethod(){
            System.out.println("From Method A");
        }
        private static void secondMethod(){
            System.out.println("From Second Method");
        }
    public void run()
    {
        System.out.println("Thread is running...");
        for(int i = 0; i < 5 ; i++)
            methodOfThread(i);
    }
    public static void methodOfThread(int i)
    {
        System.out.println("Counting in thread : " + i);
    }
}
