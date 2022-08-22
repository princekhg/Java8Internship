import java.lang.reflect.Array;
import java.util.*;

public class ArrayDuplicate {
    List<Integer> arr = new ArrayList<>();
   HashSet<Integer> hs = new HashSet<>();
    public void input()
    {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        for(int i=0;i<n;i++)
            arr.add(scr.nextInt());
    }
    private void getDuplicate()
    {
        int j;
        Collections.sort(arr);
        for(int i=0;i<arr.size()-1;i++)
        {
            j=i+1;
            if(arr.get(i) == arr.get(j))
                hs.add(arr.get(i));
        }
    }

    private void display(){
        System.out.println(Arrays.toString(hs.toArray()));
    }
    public static void main(String[] args) {
        ArrayDuplicate ad = new ArrayDuplicate();
        ad.input();
        ad.getDuplicate();
        ad.display();
    }
}
