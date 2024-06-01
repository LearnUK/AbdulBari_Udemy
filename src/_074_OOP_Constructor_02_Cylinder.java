    class cylinderTestConstructor {
    private double radius;
    private double height;
    public float lidArea() {
        return (float) (Math.PI * radius * radius);
    }
    public double circumference() {
        return (float) (2 * Math.PI * radius);
    }
    public double totalSurfaceArea() {
        return 2 * lidArea() + circumference() * height;
    }
    public double volume() {
        return lidArea() * height;
    }

    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }

    public void setRadius(double r){
       if(r>=0)
           radius =r;
       else
           radius = 0;
    }
    public void setHeight(double h){
        if(h>=0)
            height =h;
        else
            height =0;
    }

    public cylinderTestConstructor(){
        radius=1;
        height=1;
    }
    public cylinderTestConstructor(double r)
    {
        radius=getRadius();
        height=1;
    }
    public cylinderTestConstructor(double r, double h){
       setRadius(r);
       setHeight(h);
    }


}
public class _074_OOP_Constructor_02_Cylinder {
    public static void main(String[] args) {
        cylinderTestConstructor c1 = new cylinderTestConstructor();
        System.out.println("Radius1 : "+c1.getRadius());
        System.out.println("Height1 : "+c1.getHeight());
        System.out.println("LidArea1 : "+c1.lidArea());
        System.out.println("Circumference1 : "+c1.circumference());
        System.out.println("TotalSurfaceArea1 : "+c1.totalSurfaceArea());
        System.out.println("Volume1 : "+c1.volume());
        System.out.println("");

        cylinderTestConstructor c2 = new cylinderTestConstructor(-20);
        System.out.println("Radius2 : "+c2.getRadius());
        System.out.println("Height2 : "+c2.getHeight());
        System.out.println("LidArea2 : "+c2.lidArea());
        System.out.println("Circumference2 : "+c2.circumference());
        System.out.println("TotalSurfaceArea2 : "+c2.totalSurfaceArea());
        System.out.println("Volume2 : "+c2.volume());
        System.out.println("");

        cylinderTestConstructor c3 = new cylinderTestConstructor(-30,-30);
        System.out.println("Radius3 : "+c3.getRadius());
        System.out.println("Height3 : "+c3.getHeight());
        System.out.println("LidArea3 : "+c3.lidArea());
        System.out.println("Circumference3 : "+c3.circumference());
        System.out.println("TotalSurfaceArea3 : "+c3.totalSurfaceArea());
        System.out.println("Volume3 : "+c3.volume());
        System.out.println("");
    }

}
