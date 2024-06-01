@FunctionalInterface
interface MyLambdaClass{
    public void display();
}
public class _130_LambaExpression_01 {
    public static void main(String[] args) {
        MyLambdaClass m = ()->{System.out.println("Hello World");};
        m.display();
    }
}