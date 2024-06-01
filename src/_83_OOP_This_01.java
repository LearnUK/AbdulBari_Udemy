public class _83_OOP_This_01 {
    static class rectangle_this{
        int length;
        int breadth;
        rectangle_this(int length, int breadth){
            this.length = length;
            this.breadth = breadth;
        }
        boolean display(){
            System.out.println("Length : "+this.length);
            System.out.println("Breadth : "+this.breadth);
            return false;
        }
    }

    public static void main(String[] args) {
        rectangle_this r1 = new rectangle_this(5,10);
        System.out.println(r1.display());
        System.out.println("");
        rectangle_this r2 = new rectangle_this(10,15);
        System.out.println(r2.display());
    }
}
