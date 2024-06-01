package javadocdemo;
import java.util.Scanner;
public class Practice2 {
    public static int multiplyMiddleDigits(int number)  {
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
    }
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = scan.nextInt();
        int result = multiplyMiddleDigits(number);
        System.out.println("Result: " + result);
    }
}