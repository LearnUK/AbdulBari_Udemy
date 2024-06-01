import java.util.Scanner;

public class _029_LoopForSwitch_DisplayNumberIntoWords_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print ("Enter number : ");
        int n = sc.nextInt();
        int reminder;
        String str ="";
        while(n!=0)
        {
            reminder = n%10;
            str =str+reminder;
            n = n/10;

        }
        System.out.println("Reverse Number in String form is : "+str);
        char c ;
        for (int i=str.length()-1; i>=0; i--)
        {
            c = str.charAt(i);
            switch (c)
            {
                case '0' :
                    System.out.print("Zero ");
                    break;
                case '1' :
                    System.out.print("One ");
                    break;
                case '2' :
                    System.out.print("Two ");
                    break;
                case '3' :
                    System.out.print("Three ");
                    break;
                case '4' :
                    System.out.print("Four ");
                    break;
                case '5' :
                    System.out.print("Five ");
                    break;
                case '6' :
                    System.out.print("Six ");
                    break;
                case '7' :
                    System.out.print("Seven ");
                    break;
                case '8' :
                    System.out.print("Eight ");
                    break;
                case '9' :
                    System.out.print("Nine ");
                    break;
                default:
                    System.out.print("Invalid Number.");
                    break;
            }
        }
    }
}