public class RunnableThread implements Runnable {
    int[] arr = {1, 2, 3, 4, 5};

    @Override
    public void run() {
        for (int i : arr)
            System.out.println("Thread  A->" + i);
    }
}
    class B extends RunnableThread{
        public void run(){
            for(int i:arr)
                System.out.println("Thread B ->"+i);
        }
    public static void main(String[] args) {
        new Thread(new RunnableThread()).start();
        new Thread(new B()).start();
    }
}
