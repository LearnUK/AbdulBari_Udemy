import java.util.Scanner;

public class _057_Method_PrimeNumber_04 {
    static void prime(float a) {
        for (int i=2; i<=a/2; i++) {
             if(a%i ==0) {
                 System.out.println("Number "+a+" is NOT a Prime number");
                 break;
             }
             else {
                 System.out.println("Number "+a+" is a Prime number");
                 break;
             }
         }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        prime(a);
    }
}