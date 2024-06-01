import java.util.PriorityQueue;

public class _164_Collection_PriorityQueue_04 {
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.add(20);
        p.add(10);
        p.add(30);
        p.add(5);
        p.add(15);
        p.add(3);
        p.forEach((x)-> System.out.println(x));
        System.out.println("=======================");
        System.out.println(p.peek());
        System.out.println("=======================");
        p.poll();
        p.forEach((x)-> System.out.println(x));
        System.out.println("=======================");

    }
}
