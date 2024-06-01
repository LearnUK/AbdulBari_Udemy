public class _101_ExceptionHandling_01 {
    public static void main(String[] args) {
        int a=10, b=-0, c;
        try{
            c=a/b;
            System.out.println("Value of C is : "+c);
        }
        catch (Exception e){
        //catch (ArithmeticException e) {
            System.out.println("Invalid input for Denominator : "+e);
        }
    }
}
