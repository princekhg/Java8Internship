import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class LambdaExampleOne {
String[] words = {"a","hello","world","program","or","examples"};
List<String> word = new ArrayList<>(); // this is if you require user input

    // Display method which includes the count section
private void display()
{
    //convert arrays to stream using stream.of() then filter according to length and then count
    long count = Stream.of(words).filter(word -> word.length() > 3 ).count();
    System.out.println(count);

}

    public static void main(String[] args) {
        LambdaExampleOne leo = new LambdaExampleOne();
        leo.display();
    }
}

/* this function can be added to take input from the user and hence you can get the exact output as
 the display method
private void input()
{
    Scanner scr=new Scanner(System.in);
    int len = Integer.parseInt(scr.nextLine());
    words = new String[len];
    for(int i=0;i<len;i++)
        words[i] = scr.nextLine();
}
*/

