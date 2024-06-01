class rectangleTest {
    private double length;
    private double breadth;
    public double area(){
        //return length*breadth;
        return getLength()*getBreadth();
    }
    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }

    public void setLength(double l){
       if(l>=0)
           length =l;
       else
           length=0;
    }
    public void setBreadth(double b){
        if(b>=0)
            breadth = b;
        else
            breadth = 0;
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
}
public class _072_OOP_DataHiding_01 {
    public static void main(String[] args) {
        rectangleTest r1 = new rectangleTest();
        r1.setLength(-10.5);
        r1.setBreadth(10.5);

        System.out.println("Length : "+r1.getLength());
        System.out.println("Breadth : "+r1.getBreadth());

        System.out.println("Area : "+r1.area());
        System.out.println("Perimeter : "+r1.perimeter());
        System.out.println("Is it a Square?? : "+r1.isSquare());
    }

}
