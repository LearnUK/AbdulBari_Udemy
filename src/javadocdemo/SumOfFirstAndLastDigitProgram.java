package javadocdemo;
import java.util.Scanner;
public class SumOfFirstAndLastDigitProgram {
    public static void main(String args[])
    {
        Scanner scan =  new Scanner(System.in);
        System.out.print("Enter an integer number: ");
       int number = scan.nextInt();
        int temp=number;
        int firstDigit=0;
        int lastDigit=0;
        lastDigit=number%10;
        while(number!=0)
        {
            int rem = number%10;
            firstDigit=rem;
            number= number/10;
        }
        System.out.println("Number is: "+temp);
        System.out.println("First digit of number: "+ firstDigit );
        System.out.println("Last digit of number: "+ lastDigit);
        System.out.println("Sum of first and last digit of number: "+ (firstDigit+lastDigit));
    }
}