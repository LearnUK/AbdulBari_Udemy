import java.util.Scanner;

public class _013_NestedIfElse_01
{
    public static void main(String[] args)
    {
        int a , b , c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a : ");
        a = sc.nextInt();
        System.out.println("Enter values of b : ");
        b = sc.nextInt();
        System.out.println("Enter values of c : ");
        c = sc.nextInt();
        if (a>b && a>c)
        {
            System.out.println(a+" is Greater than "+b+" and "+c);
        } else if (b > c)
        {
            System.out.println(b+" is Greater than "+a+" and "+c);
        }else
            System.out.println(c+" is Greater than "+b+" and "+a);
    }
}
