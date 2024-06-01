@FunctionalInterface
interface MyLambdaParameterClass{
    public void display(String str);
}
interface MyLambdaParameterClass1{
    public int add(int x, int y);
}
public class _131_LambdaExpressionWithParameter_02 {
    public static void main(String[] args) {
        MyLambdaParameterClass m = (s)->{System.out.println(s);};
        m.display("Hello World");

        MyLambdaParameterClass1 m1 = (a,b)->{return a+b;};
        System.out.println(m1.add(2,3));

        MyLambdaParameterClass1 m2 = (a,b)->{return a+b;};
        int r2 = m2.add(20,30);
        System.out.println(r2);

        MyLambdaParameterClass1 m3 = (a,b)-> a+b;
        int r3 = m2.add(200,300);
        System.out.println(r3);
    }
}