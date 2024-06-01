import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

public class _170_LinkedHashSet_01 {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>(10);
        lhs.add("A");
        lhs.add("C");
        lhs.add("B");
        lhs.add("D");
        lhs.add("G");
        lhs.add("E");
        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}