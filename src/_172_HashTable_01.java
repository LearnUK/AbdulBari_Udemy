import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
public class _172_HashTable_01 {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(1,"A");
        ht.put(2, "B");
        ht.put(3, "C");
        ht.put(4,"D");
        ht.put(5, "E");

        String s = (String)ht.get(3);
        Enumeration e = ht.elements();
        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
        Enumeration k = ht.keys();
        while (k.hasMoreElements())
        {
            System.out.println(k.nextElement());
        }
        ht.compute(2,(key,value)-> value+"B");
        ht.computeIfAbsent(6,(key)-> "F"+key);
        System.out.println(ht);

    }
}