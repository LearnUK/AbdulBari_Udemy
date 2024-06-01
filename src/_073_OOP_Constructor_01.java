class rectangleTestConstructor {
    private double length;
    private double breadth;
    private double size;
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(){
        if(length==breadth)
            return true;
        else
            return false;
    }
    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    public double getSize(){
        return size;
    }
    public void setLength(double l){
       if(l>=0)
           length =l;
       else
           length =0;
    }
    public void setBreadth(double b){
        if(b>=0)
            breadth =b;
        else
            breadth =0;
    }
    public void setSize(double s){
        if(s>=0)
            length = breadth = s;
        else
            length = breadth = 0;
    }
    public rectangleTestConstructor(){
        length=1;
        breadth=1;
    }
    public rectangleTestConstructor(double l, double b){
       setLength(l);
       setBreadth(b);
    }
    public rectangleTestConstructor(double s){
        length=breadth=getSize();
    }

}
public class _073_OOP_Constructor_01 {
    public static void main(String[] args) {
        rectangleTestConstructor r1 = new rectangleTestConstructor();
        System.out.println("Length1 : "+r1.getLength());
        System.out.println("Breadth1 : "+r1.getBreadth());
        System.out.println("Area1 : "+r1.area());
        System.out.println("Perimeter1 : "+r1.perimeter());
        System.out.println("Is it a Square?? : "+r1.isSquare());
        System.out.println("");

        rectangleTestConstructor r2 = new rectangleTestConstructor(10,20);
        System.out.println("Length2 : "+r2.getLength());
        System.out.println("Breadth2 : "+r2.getBreadth());
        System.out.println("Area2 : "+r2.area());
        System.out.println("Perimeter2 : "+r2.perimeter());
        System.out.println("Is it a Square?? : "+r2.isSquare());
        System.out.println("");

        rectangleTestConstructor r3 = new rectangleTestConstructor(-10);
        System.out.println("Length3 : "+r3.getSize());
        System.out.println("Breadth3 : "+r3.getSize());
        System.out.println("Area3 : "+r3.area());
        System.out.println("Perimeter3 : "+r3.perimeter());
        System.out.println("Is it a Square?? : "+r3.isSquare());
        System.out.println("");

        rectangleTestConstructor r4 = new rectangleTestConstructor(-10,-20);
        System.out.println("Length4 : "+r4.getLength());
        System.out.println("Breadth4 : "+r4.getBreadth());
        System.out.println("Area4 : "+r4.area());
        System.out.println("Perimeter4 : "+r4.perimeter());
        System.out.println("Is it a Square?? : "+r4.isSquare());
        System.out.println("");

    }

}
