import java.lang.reflect.*;
class MyReflection
{
    private int a;
    protected int b;
    public int c;
    int d;

    public MyReflection() {}
    public MyReflection(int x,int y) {}

    public void display(String s1,String s2) {}
    public int show(int x,int y) {return 0;}

}

public class _129_ReflectionClass {
    public static void main(String[] args) {
        Class c=MyReflection.class;
        System.out.println(c.getName());
        System.out.println(c.getClass());
        System.out.println("=================");

        System.out.println("getDeclaredFields");
        Field field[]=c.getDeclaredFields();
        for (Field f : field)
            System.out.println(f);
        System.out.println("=================");

        System.out.println("getConstructors");
        Constructor con[] = c.getConstructors();
        for (Constructor ct :con)
            System.out.println(ct);
        System.out.println("=================");

        System.out.println("getMethods");
        Method meth[]=c.getMethods();
        for(Method m:meth)
            System.out.println(m);
        System.out.println("=================");

        System.out.println("getParameters");
        Parameter param[]=meth[0].getParameters();
        for(Parameter p:param) {
            System.out.println(p);
        }
        System.out.println("=================");
    }

}
