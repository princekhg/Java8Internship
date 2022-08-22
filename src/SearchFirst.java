import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SearchFirst {
    List<Integer> ls = new ArrayList<>();
    List<Integer> pos = new ArrayList<>();
    int search;
    private void input(){
        Scanner scr = new Scanner(System.in);
        search = scr.nextInt();
        int n = scr.nextInt();
        for(int i=0;i<n;i++)
            ls.add(scr.nextInt());
    }

    private void checkFirstLast()
    {
        for(int i=0;i<ls.size();i++)
        {
            if(ls.get(i) == search) {
                pos.add(i);
                break;
            }
        }
        for(int i=ls.size()-1;i>=0;i--)
        {
            if(ls.get(i) == search) {
                pos.add(i);
                break;
            }
        }
        if(pos.size()==0)
        {
            pos.add(-1);
            pos.add(-1);
        }
    }

    private void display(){
        System.out.println(Arrays.toString(pos.toArray()));
    }
    public static void main(String[] args) {
        SearchFirst sf = new SearchFirst();
        sf.input();
        sf.checkFirstLast();
        sf.display();

    }

}
