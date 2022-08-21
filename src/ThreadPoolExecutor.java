import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*Behaviour of Executor Thread Pool Creator
* The cached thread pool creates new threads if needed to execute the new tasks and reuses
*  the existing ones if they have finished executing the task they were running, which are now available.
*  However, the cached thread pool has the disadvantage of constant lying threads for new tasks,
* so if you send too many tasks to this executor, you can overload the system.
* This can be overcome using a fixed thread pool, which we will learn in next tutorial.
*
*
* */
class WorkerThread implements Runnable{
    private String message;
    public WorkerThread(String s) {
        this.message = s;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName());
            processmessage();//call processmessage method that sleeps the thread for 2 seconds
            System.out.println(Thread.currentThread().getName()+" (End)");//prints thread name
    }
    private void processmessage() {
        try {  Thread.sleep(2000);  } catch (InterruptedException e) { e.printStackTrace(); }
    }
}

public class ThreadPoolExecutor {
    public static void main(String[] args) {
        ExecutorService execute = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("" + i);
            execute.execute(worker);//calling execute method of ExecutorService
        }
        execute.shutdown();
        while (!execute.isTerminated()) {   }

        System.out.println("Finished all threads");

    }
}
