import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] arg)
    {
        List a=new ArrayList();
        a.add("one");
        a.add("two");
        a.add(7);
        for(String s:a)
            System.out.print(s);
    }
}
