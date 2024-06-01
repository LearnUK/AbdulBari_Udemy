import java.util.Scanner;

public class _058_Method_GratestCommonDevider_05_02 {
    static int gcd(int n1, int n2) {
        while(n1 !=n2 )
        {
            if(n1 > n2)
                n1 = n1-n2;
            else
                n2 = n2-n1;
        }
        //System.out.println(n1);
        return n1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();
        System.out.print("Greatest Common Divider for " +a+" and "+b+" is : ");
        System.out.println(gcd(a,b));

    }
}