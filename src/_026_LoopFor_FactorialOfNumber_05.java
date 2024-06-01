import java.util.Scanner;

public class _026_LoopFor_FactorialOfNumber_05
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which you need the Factorial : ");
        int n = sc.nextInt();
        int factorial = 1;
        for (int i=1; i<=n; i++)
        {
            factorial = factorial * i;
            System.out.println(factorial+" X "+i+" = "+factorial);
        }
            System.out.println("Factorial of number "+n+" is : "+factorial);
    }
}
