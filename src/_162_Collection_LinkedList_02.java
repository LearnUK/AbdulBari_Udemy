import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class _162_Collection_LinkedList_02 {
    public static void main(String[] args) {
        LinkedList<Integer> al1 = new LinkedList<>();
        //LinkedList<Integer> al3 = new LinkedList<>(List.of(50,60,70,80,90));
        LinkedList<Integer> al2 = new LinkedList<>();
        al2.add(50); al2.add(60); al2.add(70); al2.add(80); al2.add(90);
        al1.add(10);
        al1.add(0,5);
        al1.addAll(1,al2);
        al1.add(5,70);
        System.out.println("=======================");
        System.out.println(al1); System.out.println("=======================");
        System.out.println(al1.contains(50)); System.out.println("=======================");
        System.out.println(al1.get(0)); System.out.println("=======================");
        System.out.println(al1.indexOf(70)); System.out.println("=======================");
        System.out.println(al1.lastIndexOf(70)); System.out.println("=======================");
        al1.set(6,100);
        System.out.println(al1); System.out.println("=======================");
        al1.removeAll(al2);
        System.out.println(al1); System.out.println("=======================");
        for(int i=0; i<al1.size();i++){
            System.out.println(al1.get(i));
        }
        System.out.println("=======================");
        for(Integer x :al1){
            System.out.println(x);
        }
        System.out.println("=======================");
        Iterator<Integer> it = al1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("=======================");
        al1.forEach(n-> System.out.println(n));
        System.out.println("=======================");
        al1.forEach(l->show(l));
        System.out.println("=======================");
    }
    static void show(int n){
        System.out.println(n);
    }
}
