import javax.swing.plaf.TableHeaderUI;
import java.util.ArrayList;
import java.util.List;

public class ThreadClass extends Thread{

    // The question says creation of 5 Threads and print Hello All Which isn't clear
    //If you're ready to cut the crowns please understand the perception
    //1. creation of 5 threads
    // print Hello All.
    public void run(){
        System.out.println("Hello All");
    }

    public static void main(String[] args) {
        //5 Threads created // actually 6
        ThreadClass th1 = new ThreadClass();
        ThreadClass th2 = new ThreadClass();
        ThreadClass th3 = new ThreadClass();
        ThreadClass th4 = new ThreadClass();
        ThreadClass th5 = new ThreadClass();
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
    }
}
