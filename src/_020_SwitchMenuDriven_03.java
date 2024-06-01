import java.util.Scanner;

public class _020_SwitchMenuDriven_03
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("====");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        System.out.println("====");

        System.out.print("Enter value for x : ");
        int x=sc.nextInt();

        System.out.print("Enter value for y : ");
        int y=sc.nextInt();

        sc.nextLine();
        System.out.println("Enter Option in Words ");
        String option=sc.nextLine();
        option=option.toUpperCase();

        switch(option)
        {
            case "ADD": System.out.println("Sum of "+x+" and "+y+"is "+(x+y));
                break;
            case "SUB": System.out.println("Difference of "+x+" and "+y+" is "+(x-y));
                break;
            case "MUL": System.out.println("Product of "+x+" and "+y+" is "+(x*y));
                break;
            case "DIV": System.out.println("Ratio of "+x+" and "+y+" is "+(x/y));
                break;
            default:     System.out.println("Invalid Option");
                break;
        }

    }
}
