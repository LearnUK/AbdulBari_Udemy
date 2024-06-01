class MultiThreadRunnable implements Runnable{
    public void run(){
        int i=1;
        while(i<10){
            System.out.println(i+" Hello");
            i++;
        }
    }
}
public class _114_Multithread_DifferentClass_02 {
    public static void main(String[] args) {
        MultiThreadRunnable m = new MultiThreadRunnable();
        Thread t = new Thread(m);
        t.start();
        int i=1;
        while(i<10){
            System.out.println(i+" World");
            i++;
        }
    }
}
