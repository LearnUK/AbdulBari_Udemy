public class _064_Method_Overloading_VariableArguments_Area_05_02 {
    static double calculateArea(double... args) {
        System.out.println("");
        System.out.println("argument length: " + args.length);
        double area = 1;
        for (int i = 0; i < args.length; i++) {
            {
                if (args.length == 1) {
                    area = Math.PI * args[i] * args[i];
                    break;
                } else
                    area = 1 * args[i];
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