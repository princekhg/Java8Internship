public class ThreadCheck extends Thread{

    public void run(){
        for(int i=0;i<1000;i++)
            System.out.println("This is 1");
    }

    public static void main(String[] args) {
        ThreadCheck tc = new ThreadCheck();
        tc.start();
        for(int i=0;i<1000;i++)
           System.out.println("This is 2");

    }
}
