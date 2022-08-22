import java.lang.reflect.Array;
import java.util.*;

public class Panagram {
    String str;
    Set<Character> hs = new HashSet<>();
    Character ch[] = {'0','1','2','3','4','5','6','7','8','9'};
    Set<Character> hss = new HashSet<>(Arrays.asList(ch));
    private void input(){
        Scanner scr = new Scanner(System.in);
        str= scr.nextLine();
    }
    private boolean check(){
        char arr[] = str.toCharArray();
        for(int i=0;i<arr.length;i++)
            hs.add(arr[i]);
        if(hss.equals(hs))
            return true;
        return false;
    }


    public static void main(String[] args) {
        Panagram pg = new Panagram();
        pg.input();
      System.out.println(pg.check());
    }
}
