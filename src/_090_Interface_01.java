interface Super_interface{
    void meth1();
    void meth2();
}
class Sub_interface implements Super_interface{
    public void meth1() {System.out.println("Meth1 of Sub_Interface class");}
    public void meth2() {System.out.println("Meth1 of Sub_Interface class");}
    public void meth3() {System.out.println("Meth1 of Sub_Interface class");}
}

public class _090_Interface_01 {
    public static void main(String[] args) {
        Super_interface sup1 = new Sub_interface();
        sup1.meth1();
        sup1.meth2();
        System.out.println("");
        Sub_interface sub1 = new Sub_interface();
        sub1.meth1();
        sub1.meth2();
        sub1.meth3();
    }
}
