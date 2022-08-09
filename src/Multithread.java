// This class requires two other classes to run
//Make sure to run them by keeping them into a single folder
//MultiThread MultiThreadB and RunnerClassThread
public class Multithread extends Thread{
    int[] arr = {1,2,3,4,5};
    public void run(){
        for(int i:arr){
            System.out.println("From Thread A -> "+i);
        }
    }
}
