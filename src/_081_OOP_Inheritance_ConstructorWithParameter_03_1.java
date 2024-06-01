class rectangle1 {
    int length;
    int breadth;

    rectangle1() {
        length = breadth = 1;
        System.out.println("Parent Constructor with no Parameter");
    }
    rectangle1(int l, int b) {
        length = l;
        breadth = b;
        System.out.println("Parent Constructor with Parameter");
    }
}
    class cuboid extends rectangle1{
        int height;
        cuboid(){
            height=1;
            System.out.println("Child Constructor with no Parameter");
        }
        cuboid(int h){
            height = h;
            System.out.println("Child Constructor with Height as Parameter");
        }

        public cuboid(int l, int b, int h) {
            super(l,b);
            height=h;
            System.out.println("Child Constructor with Height Parameter and" +
                    "Parent Constructor with Parameter");
        }

        int volume ()
        {
            return length * breadth * height;
        }
    }

public class _081_OOP_Inheritance_ConstructorWithParameter_03_1 {
    public static void main(String[] args) {
        cuboid c1 = new cuboid();
        System.out.println("Length1 : "+c1.length+", Breadth1 : "+c1.breadth+", " +
                        "Height1 : "+c1.height);
        System.out.println("Volume1 of c1 is "+c1.volume());
        System.out.println("");
        cuboid c2 = new cuboid(10);
        System.out.println("Length2 : "+c2.length+", Breadth2 : "+c2.breadth+", " +
                "Height2 : "+c2.height);
        System.out.println("Volume2 of c2 is "+c2.volume());
        System.out.println("");
        cuboid c3 = new cuboid(3,5,10);
        System.out.println("Length3 : "+c3.length+", Breadth3 : "+c3.breadth+", " +
                "Height: "+c3.height);
        System.out.println("Volume of c3 is "+c3.volume());
        System.out.println("");
    }
}
