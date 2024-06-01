import java.util.Scanner;

public class _009_AreaOfCuboid_3
{
    public static void main(String[] args)
    {
        Scanner sc=new  Scanner(System.in);
        int length,breadth,height;
        int totalArea,volume;

        System.out.println("Enter length, breadth and height");
        System.out.print("Enter length of Cuboid : ");
        length=sc.nextInt();
        System.out.print("Enter breadth of Cuboid : ");
        breadth=sc.nextInt();
        System.out.print("Enter height of Cuboid : ");
        height=sc.nextInt();

        totalArea=2*(length*breadth+length*height+breadth*height);

        volume=length*breadth*height;

        System.out.println("Total Area of Cuboid is : "+totalArea);
        System.out.println("Total Volume of Cuboid is : "+volume);


    }
}
