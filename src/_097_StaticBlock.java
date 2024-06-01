class Test_StaticBlock_01
{
    static
    {
        System.out.println("Static Block3 Executed");
    }
    static
    {
        System.out.println("Static Block4 Executed");
    }
}
class Test_StaticBlock_02
{
    static
    {
        System.out.println("Static Block5 Executed");
    }
    static
    {
        System.out.println("Static Block6 Executed");
    }
}
public class _097_StaticBlock {
    static
    {
        System.out.println("Static Block1 Executed");
    }
    static
    {
        System.out.println("Static Block2 Executed");
    }

    public static void main(String[] args) {
        Test_StaticBlock_01 t1 = new Test_StaticBlock_01();
        System.out.println("Main method Executed");
        Test_StaticBlock_02 t2 = new Test_StaticBlock_02();
    }
}
