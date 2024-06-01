class Thread_Daemon extends Thread{
    public void run(){
        int i =1;
        while(i<100){
            System.out.println(i++);
        }
    }
}
public class _118_Thread_Daemon {
    public static void main(String[] args){
        Thread_Daemon t1 = new Thread_Daemon();
        t1.setDaemon(true);
        t1.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);;
        }
        System.out.println("Main method Finished Execution");
    }
}