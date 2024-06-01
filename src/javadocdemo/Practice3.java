package javadocdemo;
import java.util.Scanner;
public class Practice3 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = scan.nextInt();
        String numString = String.valueOf(number);
        int length = numString.length();
        System.out.println("Digits in Number : "+length);
        int firstDigit = Character.getNumericValue(numString.charAt(0));
        int lastDigit = Character.getNumericValue(numString.charAt(length - 1));
        if (length == 1) {
            System.out.println("Digit at First place is "+firstDigit);
            System.out.println("Sum of number is "+firstDigit);
        }
        if (length >1 && length <3) {
            System.out.println("Digit at First place is "+firstDigit);
            System.out.println("Digit at Last place is "+lastDigit);
            int sum = firstDigit + lastDigit;
            System.out.println("Sum of number is "+sum);
        }
        if (length >=3) {
            System.out.println("Digit at First place is "+firstDigit);
            System.out.println("Digit at Last place is "+lastDigit);
            int product = 1;
            for (int i = 1; i < length-1; i++) {
                int digit = Character.getNumericValue(numString.charAt(i));
                product *= digit;
            }
            int sum = firstDigit + lastDigit;
            System.out.println("Sum of number is "+sum);
            System.out.println("Product of middle digit is : "+product);
        }

    }
/*    public static int multiplyMiddleDigits(int number) {
        String numString = String.valueOf(number);
        int length = numString.length();
        int firstDigit = Character.getNumericValue(numString.charAt(0));
        int lastDigit = Character.getNumericValue(numString.charAt(length - 1));
        if (length <= 1) {
            System.out.println("Entered number is Single Digit");
            System.out.println("Sum of number is "+firstDigit);
            //return firstDigit;
        }
        int sum = firstDigit + lastDigit;
        System.out.println("Sum of First and Last Digit is "+sum);
        int product = 1;
        for (int i = 1; i < length - 1; i++) {
            int digit = Character.getNumericValue(numString.charAt(i));
            product *= digit;
        }
        return product;
    } */
}
