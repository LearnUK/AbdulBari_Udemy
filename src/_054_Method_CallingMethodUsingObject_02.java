import java.util.Scanner;

public class _054_Method_CallingMethodUsingObject_02 {

    int addition (int x, int y)
    {
        return x+y;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st integer : ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd integer : ");
        int b = sc.nextInt();
        _054_Method_CallingMethodUsingObject_02 m1 = new _054_Method_CallingMethodUsingObject_02();
        int c = m1.addition(a,b);
        System.out.println("Addition of "+a+" and "+b+" is : "+c);
    }
}