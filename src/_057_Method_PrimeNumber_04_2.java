import java.util.Scanner;

public class _057_Method_PrimeNumber_04_2 {
    static boolean isPrime(float n) {
        for (int i=2; i<=n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
                 return true;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        System.out.println(isPrime(19));
    }
}