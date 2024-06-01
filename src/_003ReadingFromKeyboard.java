import java.util.Scanner;

public class _003ReadingFromKeyboard {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int a, b, c;
            System.out.println("Enter value for a : ");
            a = s.nextInt();
            System.out.println("Enter value for b : ");
            b = s.nextInt();
            c = a + b;
            System.out.println("Sum of "+a+" and "+b+" is " +c);
        }
    }