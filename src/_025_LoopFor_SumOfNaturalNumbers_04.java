import java.util.Scanner;

public class _025_LoopFor_SumOfNaturalNumbers_04
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which you need the Sum : ");
        int n = sc.nextInt();
        int sum=0;
        for (int i=0; i<=n; i++)
        {
            sum = sum + i;
            //System.out.println(sum);
        }

            System.out.println("Sum of all numbers from 0 to "+n+" is : "+sum);
    }
}
