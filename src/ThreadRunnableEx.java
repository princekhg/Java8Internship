public class ThreadRunnableEx implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello India");
    }

    public static void main(String[] args) {
        ThreadRunnableEx tre=new ThreadRunnableEx();
        //5 Threads created... and each one prints Hello India
        Thread tc1 = new Thread(tre);
        Thread tc2 = new Thread(tre);
        Thread tc3 = new Thread(tre);
        Thread tc4 = new Thread(tre);
        Thread tc5 = new Thread(tre);
        tc1.start();
        tc2.start();
        tc3.start();
        tc4.start();
        tc5.start();
    }
}
