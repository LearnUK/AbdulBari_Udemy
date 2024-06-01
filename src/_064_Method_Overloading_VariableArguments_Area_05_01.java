public class _064_Method_Overloading_VariableArguments_Area_05_01 {
    static double calculateArea(double... args)
    {
        System.out.println("argument length: " + args.length);
        double area=1;
        if(args.length>1)
        {
            for(int i=0;i<args.length;i++){
                area = area*args[i];
            }
        }
        else{
            for(int i=0;i<args.length;i++){
                area = Math.PI*args[i]*args[i];
           }
        }
        return area;
        }

    public static void main(String[] args) {
        double areaOfCircle = calculateArea(10);
        System.out.println("Area of Circle = is : " + areaOfCircle);

        double areaOfRectangle = calculateArea(10,20);
        System.out.println("Area of Rectangle = is : " + areaOfRectangle);

    }
}