class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }
    public void run(){
        int i =1;
        while(i<15){
            System.out.println(i++);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class _116_ThreadConstructorAndMethod_02 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("My Thread");
        System.out.println("Id : " +t1.getId());
        System.out.println("Name : "+t1.getName());
        System.out.println("Priority : "+t1.getPriority());
        t1.setPriority(8);
        System.out.println("Priority : "+t1.getPriority());
        System.out.println("State : "+t1.getState());
        System.out.println("Starting Thread");
        t1.start();
        System.out.println("State : "+t1.getState());
        System.out.println("State : "+t1.getState());
        System.out.println("Alive : "+t1.isAlive());
        t1.interrupt();
        System.out.println("Alive : "+t1.isAlive());
        System.out.println("Name : "+t1.getName());

    }
}