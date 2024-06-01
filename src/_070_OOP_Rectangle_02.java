class rectangle {
    public int length;
    public int breadth;
    public double area() {
        return length * breadth;
    }
    public double perimeter() {
        return 2 * (length + breadth);
    }

    public boolean isSquare() {
        return length==breadth;
    }
}
public class _070_OOP_Rectangle_02 {
       public static void main(String[] args) {

        rectangle r1 = new rectangle();
        rectangle r2 = new rectangle();

        r1.length = 10; r2.length = 30;
        r1.breadth = 20; r2.breadth = 40;
        System.out.println("Area of Rectangle R1 is "+r1.area());
        System.out.println("Perimeter of Rectangle R1 is "+r1.perimeter());
        System.out.println("is Rectangle R1 is Square : "+r1.isSquare());

        System.out.println("Area of Rectangle R2 is "+r2.area());
        System.out.println("Perimeter of Rectangle R2 is "+r2.perimeter());         System.out.println("is Rectangle R1 is Square :"+r1.isSquare());
        System.out.println("is Rectangle R2 is Square : "+r2.isSquare());

       }
}
