import java.util.Scanner;

public class _058_Method_GratestCommonDevider_05 {
    static int gcd(int n1, int n2) {
        int j = 0;
        if (n1 > n2) {
            j = n1;
        } else j = n2;
        int i;
        for (i = j; i <= j; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.println("Greatest Common Divider for " +n1+" and "+n2+" is "+i);
                break;
            }
        }
        return i;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int b = sc.nextInt();
        gcd(a,b);
    }
}