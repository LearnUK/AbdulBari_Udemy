import java.util.Scanner;

public class _027_LoopWhile_NumberToDigit_06
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to convert into Digits : ");
        int n = sc.nextInt();
        int r;
        int n1 =0;
        n1 = n;
        int countOfDigits =0;
        int total =0;
        while (n>0)
        {
            r =n%10;
            n = n/10;
            System.out.println(r);
            countOfDigits++;
            total = total +(r*r*r);
        }
        System.out.println("New number is : "+total);
        System.out.println("Count of Digits in number "+n1+" are : "+countOfDigits);

        if (n1==total)
        {
            System.out.println("Number "+n1+" is Armstrong number.");
        }
        else
            System.out.println("Number "+n1+" is NOT a Armstrong number.");
    }
}
