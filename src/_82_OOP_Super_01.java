public class _82_OOP_Super_01 {
    static class rectangle_super{
        int length;
        int breadth;
        int x =10;
        rectangle_super(int length, int breadth){
            this.length = length;
            this.breadth = breadth;
        }
    }
    static class cuboid_super extends rectangle_super{
        int height;
        int x =20;
        cuboid_super(int l, int b, int h) {
            super(l, b);
            height=h;
        }
        boolean display(){
            System.out.println(super.x);
            System.out.println(x);
            return false;
        }
    }

    public static void main(String[] args) {
        cuboid_super c1 = new cuboid_super(5,10,15);
        System.out.println(c1.display());
    }
}
