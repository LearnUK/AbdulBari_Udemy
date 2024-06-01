class testSync1{
    synchronized public void display(String str){
        for (int i=0; i<str.length(); i++){
                System.out.print(str.charAt(i));
            }
    }
}
class Sync1 extends Thread{
    testSync1 st1;
    Sync1(testSync1 s1){st1=s1;}
    public void run(){st1.display("Hello World");}
}
class Sync2 extends Thread{
    testSync1 st2;
    Sync2(testSync1 s2){st2=s2;}
    public void run(){st2.display(" Welcome All");}
}
public class _122_Thread_Synchronised_01 {
    public static void main(String[] args) {
        testSync1 t =new testSync1();
        Sync1 st1 = new Sync1(t);
        Sync2 st2 = new Sync2(t);
        st1.start();
        st2.start();
    }
}
