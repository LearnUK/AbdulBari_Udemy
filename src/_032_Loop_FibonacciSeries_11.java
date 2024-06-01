import java.util.Scanner;

public class _032_Loop_FibonacciSeries_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Intervals in Fibonacci series : ");
        int interval = sc.nextInt();
        int sum = 0, sum1 = 1, sum2 = 0;
        for (int i = 0; i < interval; i++) {
            System.out.print(sum2 + " ");
            sum = sum1;
            sum1 = sum2;
            sum2 = sum + sum2;
        }
        System.out.println("");
        System.out.println("Answer with Other solution");
        //Other Solution
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2);//printing 0 and 1

        for (int j = 2; j < interval; ++j)//loop starts from 2 because 0 and 1 are already printed
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}