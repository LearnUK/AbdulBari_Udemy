class Test_Static{
    static int x =10;
    int y =20;
    void show_static(){
        System.out.println("Value of X is "+x+" and Value of Y is "+y);
    }
    static void display_static(){
        //System.out.println("Value of X is "+x+" and Value of Y is "+y);
        System.out.println("Value of X is "+x);
    }
}
public class _096_StaticMember_VariableAndMethod_02 {
    public static void main(String[] args) {
        Test_Static t1 = new Test_Static();
        Test_Static t2 = new Test_Static();
        t1.show_static();
        t2.show_static();
        System.out.println("");
        Test_Static.display_static();
        System.out.println("");
        t1.x=30;
        t1.y=50;
        t1.show_static();
        t2.show_static();
        System.out.println("");
    }
}
