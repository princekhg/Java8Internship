import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// to maintain the order an arraylist is used
public class ArrayListInt {
    List<Integer> list = new ArrayList<>();
    //Method to add values into the arraylist
    // Uses bufferedReader
    private void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 6 number and the key");
        for(int i=0;i<6;i++)
            list.add(Integer.parseInt(br.readLine()));
    }
    // Method to display the values
    public void display(){
        System.out.println("The content of HashSet Includes");
        for(int i : list)
            System.out.println(i);
    }

    public static void main(String[] args) throws IOException {
        ArrayListInt als = new ArrayListInt();
        als.input();
        als.display();
    }
}
