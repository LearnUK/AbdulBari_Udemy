import java.util.Scanner;

public class _053_Method_CallingStaticMethod_01 {

    static int addition (int x, int y)
    {
        int z = x + y;
        return z;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st integer : ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd integer : ");
        int b = sc.nextInt();
        int c = addition(a,b);
        System.out.println("Addition of "+a+" and "+b+" is : "+c);
    }
}