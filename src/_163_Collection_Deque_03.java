import java.util.ArrayDeque;

public class _163_Collection_Deque_03 {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offerLast(10);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);
        dq.forEach(x-> System.out.println(x));
        System.out.println("=======================");
        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);
        dq.offerFirst(4);
        dq.forEach(x-> System.out.println(x));
        System.out.println("=======================");
        dq.pollFirst();
        dq.forEach(x-> System.out.println(x));
        System.out.println("=======================");
        System.out.println("=======================");

    }
}
