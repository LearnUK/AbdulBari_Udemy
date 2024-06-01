class circle {
    public double radius;
    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public double circumference() {
        return perimeter();
    }
}
public class _069_OOP_Circle_01 {
       public static void main(String[] args) {

        circle c1 = new circle();
        circle c2 = new circle();

        c1.radius = 10;
        System.out.println("Area of Circle C1 is "+c1.area());
        System.out.println("Perimeter of Circle C1 is "+c1.perimeter());
        System.out.println("Circumference of Circle C1 is "+c1.circumference());

        c2.radius = 20;
        System.out.println("Area of Circle C2 is "+c2.area());
        System.out.println("Perimeter of Circle C2 is "+c2.perimeter());
        System.out.println("Circumference of Circle C2 is "+c2.circumference());

    }
}
