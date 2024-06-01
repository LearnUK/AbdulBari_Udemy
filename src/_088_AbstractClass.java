abstract class Super_abstract{
    public Super_abstract(){
        System.out.println("Super_Abstract Constructor.");
    }
    public void meth1(){
        System.out.println("Meth1 of Super.");
    }
    abstract public void meth2();
}
class Sub_abstract extends Super_abstract{
    public Sub_abstract(){
        System.out.println("Sub_Abstract Constructor.");
    }
    @Override
    public void meth2(){
        System.out.println("Meth2 of Sub.");
    }
    public void meth3(){
        System.out.println("Meth3 of Sub");
    }
}
public class _088_AbstractClass {
    public static void main(String[] args) {
        //Super_abstract s1 =new Super_abstract();
        Super_abstract s2 = new Sub_abstract();
        s2.meth1();
        s2.meth2();
        System.out.println("");
        Sub_abstract s3 = new Sub_abstract();
        s3.meth1();
        s3.meth2();
    }

}
