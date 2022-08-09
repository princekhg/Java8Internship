public class MultiThreadB extends Multithread{
    public void run(){
        for(int i:arr)
            System.out.println("From Thread B ->" +i);
    }
}
