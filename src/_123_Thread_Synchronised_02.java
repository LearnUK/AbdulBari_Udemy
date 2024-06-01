class testSync11 {
    void display(String str) {
        synchronized (this) {
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));
            }

        }
    }
}
class Sync11 extends Thread{
    testSync11 st1;
    Sync11(testSync11 s1){st1=s1;}
    public void run(){st1.display("Hello World");}
}
class Sync22 extends Thread{
    testSync11 st2;
    Sync22(testSync11 s2){st2=s2;}
    public void run(){st2.display(" Welcome All");}
}
public class _123_Thread_Synchronised_02 {
    public static void main(String[] args) {
        testSync11 t =new testSync11();
        Sync11 st1 = new Sync11(t);
        Sync22 st2 = new Sync22(t);
        st1.start();
        st2.start();
    }
}
