class MultiThread extends Thread{
    public void run(){
        int i=1;
        while(i<10){
            System.out.println(i+" Hello");
            i++;
        }
    }
}
public class _112_Multithreading_DifferentClass_02 {
    public static void main(String[] args) {
        MultiThread t = new MultiThread();
        t.start();
        int i=1;
        while(i<10){
            System.out.println(i+" World");
            i++;
        }
    }
}
