import java.util.Scanner;

public class _015_LeapYear
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.println("Enter Year : ");
        year = sc.nextInt();
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println("Year "+year+" is a leap year.");
                }
                else
                    System.out.println("Year "+year+" is Not a leap year.");
            }
            else
                System.out.println("Year "+year+" is a leap year.");
        }
        else
            System.out.println("Year "+year+" is Not a leap year.");
    }
}