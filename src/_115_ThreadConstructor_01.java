class MyRun implements Runnable{
    public void run(){}
}
public class _115_ThreadConstructor_01 {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread("My Name");
        Thread t3 = new Thread(new MyRun());
        Thread t4 = new Thread(new MyRun(), "My Name");
    }
}
