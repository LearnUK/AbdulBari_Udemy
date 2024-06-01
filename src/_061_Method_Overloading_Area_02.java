public class _061_Method_Overloading_Area_02 {

    static double area(double l, double b)
    {
        System.out.print("Area of Rectangle with Length "+l+" and Breadth "+b+" is : ");
        return l*b;
    }
    static double area(double r)
    {
        System.out.print("Area of Circle with Radius "+r+" is : ");
        return Math.PI*r*r;
    }

    public static void main(String[] args)
    {
        System.out.println(area(10));
        System.out.println(area(20,30));
    }
}