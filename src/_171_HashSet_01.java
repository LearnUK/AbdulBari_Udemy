import java.util.HashSet;
import java.util.Iterator;

public class _171_HashSet_01 {
    public static void main(String[] args) {
        HashSet<String> lh = new HashSet<>(10);
        lh.add("A");
        lh.add("C");
        lh.add("B");
        lh.add("D");
        lh.add("G");
        lh.add("E");
        Iterator<String> itr = lh.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}