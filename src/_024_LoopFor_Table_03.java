import java.util.Scanner;

public class _024_LoopFor_Table_03
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which you need table : ");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++)
            System.out.println(n+" X "+i+" = "+(n*i));
    }
}
