import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.HashSet;
// Set doesn't contain duplicate elements
public class DuplicateRemoval {
    HashSet<Integer> hs = new HashSet<>();
    private void input()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter values in the list and ENTER -1 TO STOP ADDING VALUES");
       for(int i=0;;i++)
        try {
            int n = Integer.parseInt(br.readLine());
            if(n>=0) {
                hs.add(n);
            }else
                break;
        }catch(NumberFormatException e) {
            System.out.println(e.getMessage()+"Add an integer value");
        }
    }
    private void display(){
        hs.forEach(System.out::println);
    }

    public static void main(String[] args)throws IOException {
        DuplicateRemoval dr = new DuplicateRemoval();
        dr.input();
        dr.display();
    }
}
