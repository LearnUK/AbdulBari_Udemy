import java.util.Scanner;

public class _009_AreaOfTriangle_2
{
    public static void main(String[] args)
    {
        int side1, side2, side3;
        float s;
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1 of Triangle : ");
        side1 = sc.nextInt();
        System.out.print("Enter side2 of Triangle : ");
        side2 = sc.nextInt();
        System.out.print("Enter side3 of Triangle : ");
        side3 = sc.nextInt();

        s = (side1 + side2 + side3)*1/2f;
        System.out.println("Semi Perimeter of Triangle is : "+s);

        area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));

        System.out.println("Area of Triangle is :"+area);
    }
}
