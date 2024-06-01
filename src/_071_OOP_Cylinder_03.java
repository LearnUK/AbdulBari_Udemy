class cylinder {
    public float radius;
    public float height;
    public float lidArea() {
        return (float) (Math.PI * radius * radius);
    }
    public float circumference() {
        return (float) (2 * Math.PI * radius);
    }
    public float totalSurfaceArea() {
        return 2 * lidArea() + circumference() * height;
    }
    public float volume() {
        return lidArea() * height;
    }
}
public class _071_OOP_Cylinder_03 {
       public static void main(String[] args) {
       cylinder c1 = new cylinder();
       cylinder c2 = new cylinder();

        c1.radius = 7; c1.height = 10;
        System.out.println("Area of Lid Cylinder C1 is "+c1.lidArea());
        System.out.println("Circumference of Cylinder C1 is "+c1.circumference());
        System.out.println("Total surface area of Cylinder C1 is "+c1.totalSurfaceArea());
        System.out.println("Volume of Cylinder C1 is "+c1.volume());

        c2.radius = 30; c2.height = 40;
        System.out.println("Area of Cylinder C2 is "+c2.lidArea());
        System.out.println("Circumference of Cylinder C1 is "+c2.circumference());
        System.out.println("Perimeter of Cylinder C2 is "+c2.totalSurfaceArea());
        System.out.println("Circumference of Cylinder C2 is "+c2.volume());

    }
}
