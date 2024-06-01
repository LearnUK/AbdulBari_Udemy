class Thread_Interrupt extends Thread{
    public Thread_Interrupt(String name) {
        super(name);
        //setPriority(Thread.MAX_PRIORITY);
    }
    public void run(){
        int i =1;
        while(i<15){
            System.out.println(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);;
            }
        }
    }
}
public class _117_Thread_Interrupt_01 {
    public static void main(String[] args) {
        Thread_Interrupt t1 = new Thread_Interrupt("My Thread");
        t1.start();
        t1.interrupt();
    }
}