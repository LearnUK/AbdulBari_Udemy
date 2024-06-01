@FunctionalInterface
interface MyLambdaExpression1{
    public void display(String str);
}
interface MyLambdaExpression2{
    public int display(String str1, String str2);
}
public class _132_LambdaExpression_MethodReference {
    public static void reverse(String str){
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
    public _132_LambdaExpression_MethodReference(String s){
        System.out.println(s.toUpperCase());
    }
    public void reverse1(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
    public static void main(String[] args) {
        MyLambdaExpression1 m1 = System.out::println;
        m1.display("Hello");

        MyLambdaExpression1 m2 = _132_LambdaExpression_MethodReference::reverse;
        m2.display("Hello");

        _132_LambdaExpression_MethodReference le = new _132_LambdaExpression_MethodReference("Hello");
        MyLambdaExpression1 m3 = le::reverse1;
        m3.display("Hello");

        MyLambdaExpression1 m4 = _132_LambdaExpression_MethodReference::new;
        m4.display("hello");

        MyLambdaExpression2 m5 = String::compareTo;
        System.out.println(m5.display("Hello","Hello"));
        System.out.println(m5.display("Hello","hello"));
        System.out.println(m5.display("Iello","Hello"));
        }
    }