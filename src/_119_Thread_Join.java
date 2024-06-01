class Thread_Join extends Thread{
    public void run(){
        int i =1;
        while(i<100){
            System.out.println(i++);
        }
    }
}
public class _119_Thread_Join {
    public static void main(String[] args) throws Exception {
        Thread_Join t1 = new Thread_Join();
        t1.setDaemon(true);
        t1.start();
        Thread mainThread = Thread.currentThread();
        System.out.println("Main method Running Execution");
        mainThread.join();
        System.out.println("Main method finished Execution");
    }
}