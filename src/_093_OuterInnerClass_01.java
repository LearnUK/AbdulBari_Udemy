class Outer{
    static int x =10;
    Inner i = new Inner();
    class Inner{
        int y =20;
        public void InnerDisplay(){
            System.out.println("Value of X "+x+" and Value of Y is "+y);
        }
    }
    public void OuterDisplay(){
        //Inner i = new Inner();
        i.InnerDisplay();
        System.out.println(i.y);
    }
}
public class _093_OuterInnerClass_01 {
    public static void main(String[] args) {
    Outer o = new Outer();
    o.OuterDisplay();
    System.out.println("");

    Outer.Inner oi = new Outer().new Inner();
        oi.InnerDisplay();
    }
}
