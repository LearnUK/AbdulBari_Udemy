import java.util.Scanner;

public class _028_LoopWhile_ReverseNumber_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print ("Enter number : ");
        int n = sc.nextInt();
        int n1 =n;
        int reverse = 0;
        int reminder;
        while(n!=0)
        {
            reminder = n%10;
            reverse =(reverse*10)+reminder;
            n = n/10;
        }
        System.out.println("Reverse of number '"+n1+"' is : '"+reverse+"'");
        if(n1==reverse)
        {
            System.out.println("Number "+n1+" is a Palindrome number");
        }
        else
        {
            System.out.println("Number "+n1+" is NOT a Palindrome number");
        }
    }
}