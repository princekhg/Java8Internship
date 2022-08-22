import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class CheckMain{
    List<Integer> ls = new ArrayList<>();
    List<Integer> lsOdd = new ArrayList<>();
    int arr[];
    private void input(){
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        for(int i=0;i<n;i++)
            ls.add(scr.nextInt());
    }

    private void oddCheck(){
        for(int i: ls)
        {
            if(i%2!=0)
                lsOdd.add(ls.get(i));
        }
        arr = new int[lsOdd.size()];
        for(int i=0;i<lsOdd.size();i++)
            arr[i] = lsOdd.get(i);
    }

   private void display(){
        System.out.println(Arrays.toString(lsOdd.toArray()));
   }

    public static void main(String[] args){
    CheckMain mn = new CheckMain();
    mn.input();
    mn.oddCheck();
    mn.display();
    }
}
