import java.util.Scanner;

public class _009_AreaOfTriangle_1
{
    public static void main(String[] args)
    {
        float base, height, area;
        //System.out.println("Enter Base and Height of Triangle : ");

        Scanner sc = new Scanner(System.in);
        System.out.print("Base of Triangle is : ");
        base = sc.nextFloat();
        System.out.print("Height of Triangle is : ");
        height = sc.nextFloat();

        area = base * height/2;

        System.out.println("Area of Triangle is : "+area);
    }
}
