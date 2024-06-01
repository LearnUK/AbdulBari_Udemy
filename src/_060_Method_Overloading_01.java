import java.util.Scanner;

public class _060_Method_Overloading_01 {

    static int max(int x, int y)
    {
        System.out.println("Maximum number between "+x+" and "+y+" is : ");
        return x>y?x:y;
    }
    static float max(float m, float n)
    {
        return m>n?m:n;
    }
    static double max(double j, double k)
    {
        return j>k?j:k;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number");
        int b = sc.nextInt();
        System.out.println(max(5,8));
        System.out.println(max(5.0f,8.0f));
        System.out.println(max(5.0,8.0));

    }
}