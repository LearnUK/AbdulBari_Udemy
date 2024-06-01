abstract class shape_abstract{
    abstract public double perimeter_abstract();
    abstract public double area_abstract();
}
class circle_abstract extends shape_abstract{
    double radius;
    @Override
    public double perimeter_abstract() {
        return 2 * Math.PI * radius;
    }
    @Override
    public double area_abstract() {
        return Math.PI * radius * radius;
    }
}
class rectangle_abstract extends shape_abstract{
double length;
double breadth;
    @Override
    public double perimeter_abstract() {
        return 2 * (length+breadth);
    }
    @Override
    public double area_abstract() {
        return length*breadth;
    }
}

public class _089_AbstractClass_02 {
    public static void main(String[] args) {
        circle_abstract c1 = new circle_abstract();
        c1.radius =5;
        shape_abstract s1 = c1;
        System.out.println(s1.perimeter_abstract());
        System.out.println(s1.area_abstract());
        System.out.println("");
        rectangle_abstract r1 = new rectangle_abstract();
        r1.length = 5;
        r1.breadth = 10;
        shape_abstract s2 = r1;
        System.out.println(s2.perimeter_abstract());
        System.out.println(s2.area_abstract());
    }
}
