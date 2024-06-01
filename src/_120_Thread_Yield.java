class Thread_Yield extends Thread{
    public void run(){
        int i =1;
        while(true){
            System.out.println(i++ +" Join Yield");
        }
    }
}
public class _120_Thread_Yield {
    public static void main(String[] args) throws Exception {
        Thread_Yield t1 = new Thread_Yield();
        t1.setDaemon(true);
        t1.start();
        int i =1;
        while(true){
            System.out.println(i++ +" Main Method");
            Thread.yield();
        }
    }
}