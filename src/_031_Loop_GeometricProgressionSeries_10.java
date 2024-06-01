import java.util.Scanner;

public class _031_Loop_GeometricProgressionSeries_10
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lets create Geometric Progression series");
        System.out.print ("Enter starting Number in Series: ");
        int start = sc.nextInt();
        System.out.print ("Enter multiplying factor in Series: ");
        int diff = sc.nextInt();
        System.out.print ("Enter number of intervals in Series: ");
        int intervals = sc.nextInt();
        int total = start;
        System.out.println("");
        System.out.println("Executing For Loop");
        for(int i=0; i<intervals; i++)
        {
            System.out.print(total+" ");
            total = total * diff;
        }
        int j =0;
        int total1 = start;
        System.out.println("");
        System.out.println("Executing While Loop");
        while(j<intervals)
        {
            System.out.print(total1+" ");
            total1 = total1 * diff;
            j++;
        }
        System.out.println("");
        System.out.println("Executing Do-While Loop");
        int k=0;
        int total2 = start;
        do
        {
            System.out.print(total2+" ");
            total2 = total2 * diff;
            k++;
        }while(k<intervals);
    }
}