class testSynchronise{
    void dispaly(String str){
        for (int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i));
        }
    }
}
class SyncThread1 extends Thread{
    testSynchronise st1;
    SyncThread1(testSynchronise s1){st1=s1;}
    public void run(){st1.dispaly("Hello World");}
}
class SyncThread2 extends Thread{
    testSynchronise st2;
    SyncThread2(testSynchronise s2){st2=s2;}
    public void run(){st2.dispaly(" Welcome All");}
}
public class _121_Thread_NotSynchronised_01 {
    public static void main(String[] args) {
        testSynchronise t =new testSynchronise();
        SyncThread1 st1 = new SyncThread1(t);
        SyncThread2 st2 = new SyncThread2(t);
        st1.start();
        st2.start();
    }
}
