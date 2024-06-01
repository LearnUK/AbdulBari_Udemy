class CircleTestInheritence {
    public double radius;
    public CircleTestInheritence(double r){
        double radius = r;
    }
    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
    public double circumference(){
        return perimeter();
    }
}

class CylinderTestInheritence extends CircleTestInheritence{
    public double height;

    public CylinderTestInheritence(double r, double h) {
        super(r);
        this.height =h;
    }

    public double volume(){
        return area() * height;
    }
}
public class _078_OOP_Inheritance_Circle_Cylinder_01 {
    public static void main(String[] args) {
        CylinderTestInheritence cyl1 = new CylinderTestInheritence(7, 10);
        cyl1.radius = 7;
        cyl1.height = 10;
        System.out.println("Radius :"+ cyl1.radius);
        System.out.println("Height :"+ cyl1.height);

        System.out.println("Volume : "+cyl1.volume());
        System.out.println("Area : "+ cyl1.area());

//        System.out.println("Area Constructor Method");
    }
}
