import jdk.jfr.SettingDescriptor;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CheckClass
{
    int len;
    List<Integer> list = new ArrayList<>();

    private void input()
    {
        Scanner scr=new Scanner(System.in);
        len = Integer.parseInt(scr.nextLine());
        for(int i=0;i<len;i++)
            list.add(scr.nextInt());
    }

    private void display() {
        Set<Integer> data = new HashSet<>();
        TreeSet<Integer> output = list.stream().filter(n -> !data.add(n))
                .collect(Collectors.toCollection(TreeSet::new));
        output.forEach(System.out::println);
    }


    public static void main(String[] args)
    {
     CheckClass cc = new CheckClass();
     cc.input();
     cc.display();

    }
}
