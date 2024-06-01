import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

abstract class MyAbstract{
    abstract public void show();
}
class Outer3 {
    public void display3() {
        MyAbstract m = new MyAbstract() {public void show(){System.out.println("Hello3");}};
        m.show();
        new MyAbstract() {public void show(){System.out.println("Hello3");}}.show();
        }
}
class Outer1{
    public void display1(){
        class Inner1{
            public void show(){
                System.out.println("Hello1");
            }
        }
        Inner1 i = new Inner1();
        i.show();
    }
    public void display2(){
        class Inner2{
            public void show2(){
                System.out.println("Hello2");
            }
        }
        new Inner2().show2();
    }
}
public class _094_LocalInnerClass_01 {
    public static void main(String[] args) {
        Outer1 o1 = new Outer1();
        o1.display1();
        System.out.println("");

        Outer1 o2 = new Outer1();
        o2.display2();
        System.out.println("");

        Outer3 o3 = new Outer3();
        o3.display3();
        System.out.println("");

    }
}
